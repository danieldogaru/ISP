/**
 * Created with IntelliJ IDEA.
 * User: Daniel
 * Date: 5/22/16
 * Time: 12:15 PM
 * To change this template use File | Settings | File Templates.
 */
package Tests;
import Classes.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.JUnitCore;

import java.util.Vector;

public class TowerTest {

    @Test
    public void testTower(){
        Vector<Person> persons = new Vector<Person>();
        Vector<Airplane> airplanes = new Vector<Airplane>();

        persons.add(new Person("Controller", "Person1"));

        AirplaneData airplaneData = new AirplaneData("LU1255", "Comercial", "Airbus A321", "LOTP", "LHR", 250);
        NavigationData navigationData = new NavigationData(250, 200);

        Assert.assertTrue(navigationData.getHeading() >= 0 && navigationData.getHeading() <= 360);
        Assert.assertTrue(navigationData.getSpeed() > 0);

        airplanes.add(new Airplane(airplaneData, navigationData, new Person("Pilot","Pilot1"), persons.get(0),
                      "PendingLanding", 120.22 ));
        Tower tower = new Tower(new Vector<Person>(), new Vector<Airplane>(), 120.22);

        Assert.assertEquals(tower.getFrequency(), airplanes.get(0).getFrequency(), 0.001);

        airplanes.get(0).RequestLanding(tower);
        Assert.assertEquals(airplanes.get(0).getStatus(), "LandingGranted");

        Assert.assertTrue(airplanes.get(0).RequestTurnAround());

        airplanes.get(0).RequestLanding(tower);
        Assert.assertEquals(airplanes.get(0).getStatus(), "LandingGranted");

        airplanes.get(0).Land();
        tower.SendToGround(airplanes.get(0));
        Assert.assertEquals(airplanes.get(0).getStatus(), "Landing");
    }

    public static void main(String args[]){
        Result result = JUnitCore.runClasses(TowerTest.class);
        for( Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
