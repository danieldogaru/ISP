/**
 * Created with IntelliJ IDEA.
 * User: Daniel
 * Date: 5/22/16
 * Time: 6:57 PM
 * To change this template use File | Settings | File Templates.
 */
package Tests;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.JUnitCore;
import Classes.*;

public class WeatherTest {
    @Test
    public void TestWeather(){
          Wind wind = new Wind(100, 100);
          Weather weather = new Weather(wind, "Sunny", 1024, 30);

        Assert.assertTrue(weather.getWind().getDirection() >= 0 && wind.getDirection() <= 360);
        Assert.assertTrue(weather.getWind().getSpeed() >= 0);
        Assert.assertTrue(weather.getPressure() > 0);
    }

    public static void main(String args[]){
        Result result = JUnitCore.runClasses(WeatherTest.class);
        for( Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
