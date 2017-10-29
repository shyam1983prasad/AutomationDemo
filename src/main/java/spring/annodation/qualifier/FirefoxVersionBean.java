package spring.annodation.qualifier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by muthuselvan on 10/29/17.
 */
@Configuration
public class FirefoxVersionBean {


    @Bean(name="firefox")
    public FirefoxRunner getVersion() {
        return new FirefoxRunner();

    }
}
