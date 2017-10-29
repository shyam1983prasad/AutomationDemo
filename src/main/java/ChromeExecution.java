import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

/**
 * Created by muthuselvan on 7/29/17.
 */
public class ChromeExecution implements Browser {


    public ChromeExecution() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
    }


    @Override
    public WebDriver start() {
        System.out.println("Starting chrome");
        WebDriver driver = new ChromeDriver();

        return driver;


    }



}
