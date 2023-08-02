package stepDefinitions;

import org.junit.After;
import org.junit.Before;
import utils.Driver;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println( "Before method");
        Driver.initDriver();
    }

    @After
    public void tearDown(){

        Driver.getDriver().quit();
    }
}
