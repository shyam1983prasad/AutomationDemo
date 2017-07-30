import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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

    }

}
