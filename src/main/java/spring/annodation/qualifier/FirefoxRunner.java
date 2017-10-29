package spring.annodation.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by muthuselvan on 10/29/17.
 */

public class FirefoxRunner {
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    String version ;



    public FirefoxRunner() {

    }




}
