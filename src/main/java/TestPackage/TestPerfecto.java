package TestPackage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by muthuselvan on 10/16/17.
 */
public class TestPerfecto {

    protected static AppiumDriver driver;


    @Test
    public void testPerfecto() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        String p_host = "citrix.perfectomobile.com";
        String p_user="muthu.selvan@citrix.com";
        String p_password = "Citrix123";
        String cloud_url = "https://" + p_host + "/nexperience/perfectomobile/wd/hub";
        capabilities.setCapability("user", p_user);
        capabilities.setCapability("password", p_password);
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "7.0");
        capabilities.setCapability("manufacturer", "Samsung");
        capabilities.setCapability("model", "Galaxy J7");
        capabilities.setCapability("location", "NA-US-BOS");
        capabilities.setCapability("resolution", "720 x 1280");

        capabilities.setCapability("app","PUBLIC:applications/receiver-normal-release-10.5.20.apk");


        try {
            driver = new AndroidDriver((new URL(cloud_url)), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        System.out.println("Session ID >> " +driver.getSessionId());

    }
}
