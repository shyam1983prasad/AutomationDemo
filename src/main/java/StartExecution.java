import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * Created by muthuselvan on 7/29/17.
 */
public class StartExecution {

    public static void main(String[] args) {
        BrowserFactory browserFactory = new BrowserFactory();
        WebDriver chrome = browserFactory.getBrowser("Chrome").start();
        chrome.get("https://google.com");
        chrome.findElement(By.name("q")).sendKeys("java");
        chrome.findElement(By.cssSelector("input[type=\"submit\"]")).click();
        RemoteWebDriver ff = new FirefoxDriver();
        RemoteWebDriver  chr = new ChromeDriver();




    }

}
