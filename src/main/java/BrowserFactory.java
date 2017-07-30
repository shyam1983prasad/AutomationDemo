/**
 * Created by muthuselvan on 7/29/17.
 */
public class BrowserFactory {


    public Browser getBrowser(String browserType) {

        if (browserType == null) {
            return null;
        }

        if (browserType.equals("Chrome")) {
            return new ChromeExecution();
        }

        return null;
    }



}


