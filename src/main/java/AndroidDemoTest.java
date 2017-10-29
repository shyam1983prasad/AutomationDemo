import com.gargoylesoftware.htmlunit.ElementNotFoundException;
//import com.paypal.selion.platform.grid.Grid;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.MalformedURLException;
import java.net.URL;

//import com.paypal.selion.annotations.MobileTest;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
//import com.paypal.selion.annotations.MobileTest;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * Created by muthuselvan on 10/11/17.
 */
public class AndroidDemoTest {
    protected static AppiumDriver driver;

    public static void main(String[] args) {

    }

//
//    @MobileTest(appPath = "/Users/muthuselvan/Documents/receiver-normal-release.apk",device = "android:7.0")
//    @org.testng.annotations.Test
//    public void testmobile() {
//        RemoteWebDriver driver = Grid.driver();
////        System.out.println(driver.findElementByXPath());
//
//    }

    @Test
    public void testAndroidAppium() throws InterruptedIOException, InterruptedException {
        String username = "muthus";
        String password = "Citrix123";
        DesiredCapabilities capabilities = new DesiredCapabilities();
        File app= new File("/Users/muthuselvan/Documents/receiver-normal-release.apk");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("automationName","appium");
//        capabilities.setCapability("deviceName","Samsung RIL v3.0");

        capabilities.setCapability("deviceName","Nexus6P"); //adb shell getprop ro.product.model
//        capabilities.setCapability("deviceName","Nexsus 7"); //adb shell getprop ro.product.model
         // udid is not required when running one device
//        capabilities.setCapability("udid","072170ae");
//        capabilities.setCapability("udid","auto");
        capabilities.setCapability("platformVersion","6.0");
//        capabilities.setCapability("platformVersion","6.0.1"); // adb shell getprop ro.build.version.release
        capabilities.setCapability("autoDismissAlerts", true);

//        capabilities.setCapability("platformVersion","7.0");
        capabilities.setCapability("noReset","true");
        capabilities.setCapability(CapabilityType.BROWSER_NAME,"");
        capabilities.setCapability("appPackage", "com.zenprise");
        capabilities.setCapability("appActivity", "com.citrix.work.common.activities.LauncherActivity");
        capabilities.setCapability("app", app.getAbsolutePath());

//        driver.executeAsyncScript()
        try {
            driver = new AndroidDriver((new URL("http://127.0.0.1:4723/wd/hub")), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        Thread.sleep(1000);
        driver.findElement(By.id("com.zenprise:id/field1")).sendKeys("copsqaaz10723.xm.cloud.com");
//        driver.findElement(By.id("com.zenprise:id/field1")).sendKeys("https://copsqaaz10723.xm.cloud.com:4443");
        driver.findElement(By.id("com.zenprise:id/next")).click();
        System.out.println("Clicked next ..will wait");

        Thread.sleep(2500);




        //Yes, Enroll
//        driver.findElement(By.name("Yes, Enroll")).click();

//        driver.executeScript("mobile:button-text:click");

//          driver.switchTo().alert();

        Thread.sleep(3200);


        driver.findElement(By.id("com.zenprise:id/positive_btn")).click();
//        driver.findElementById("com.zenprise:id/positive_btn").click();

//          driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button[1]")).click();
//        System.out.println("Page Source : " +driver.getPageSource());
//         String enrollButtonString = "Yes, Enroll";
//        Map<String, String> params = new HashMap<>();
//        params.put("label",enrollButtonString);
//        driver.executeScript("mobile:button-text:click", params);

//        driver.execute("");




//        driver.switchTo().alert().dismiss();

//        try {
//            driver.findElement(By.id("com.zenprise:id/positive_btn")).click();
//        } catch (ElementNotFoundException e) {
//            System.out.println("Error : " +e.getMessage());
//        }
        System.out.println("Clicked positive button");



        Thread.sleep(1000);


        driver.findElement(By.id("com.zenprise:id/field1")).sendKeys(username);


//        driver.findElement(By.id("com.zenprise:id/field1")).sendKeys(Keys.TAB);

//        driver.findElement(By.id("com.zenprise:id/field1")).sendKeys("JTR=64kct6Jhqg==");

        Thread.sleep(100);

//        driver.findElement(By.id("com.zenprise:id/password")).findElement(By.id("com.zenprise:id/field1")).sendKeys("JTR=64kct6Jhqg==");
//        driver.findElement(By.id("com.zenprise:id/password")).findElement(By.id("com.zenprise:id/field1")).sendKeys("JTR=64kct6Jhqg==".trim());

        driver.findElement(By.id("com.zenprise:id/password")).findElement(By.id("com.zenprise:id/field1")).click();



        if (driver.getKeyboard() == null ) {
            System.out.println("Error ..No Keyboaro ..");
        } else {
            System.out.println("Yes KB Found");
        }

        driver.findElement(By.id("com.zenprise:id/password")).findElement(By.id("com.zenprise:id/field1")).sendKeys(password);

        Thread.sleep(100);
//        String password= driver.findElement(By.id("com.zenprise:id/password")).findElement(By.id("com.zenprise:id/field1")).getText();
//        System.out.println("Password : " +password);

        Thread.sleep(100);

        driver.findElement(By.id("com.zenprise:id/login")).click();

        Thread.sleep(8000);
        System.out.println("PG : " +driver.getPageSource());

//        driver.findElement(By.id("com.android.settings.DeviceAdminAdd:id/action_button")).click();

           driver.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);

          driver.findElementById("com.android.settings:id/action_button").click();

//        driver.findElement(By.name("Activate")).click();


        // click my apps : com.zenprise:id/favorites




        //click store : com.zenprise:id/apps





    }




}
