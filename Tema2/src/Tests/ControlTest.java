package Tests;

/**
 * Created with IntelliJ IDEA.
 * User: Daniel
 * Date: 5/22/16
 * Time: 7:08 PM
 * To change this template use File | Settings | File Templates.
 */
import Classes.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.JUnitCore;

public class ControlTest {
    @Test
    public void TestControl(){

        Control control = new Control(new Ground(), new Tower());
        Assert.assertNotNull(control);
    }

    public static void main(String[] args){
        Result result = JUnitCore.runClasses(ControlTest.class);
        for( Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }

}
