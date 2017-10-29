package spring.annodation.config.spring.annodation.beanInjection;

import org.springframework.context.annotation.Bean;

/**
 * Created by muthuselvan on 10/28/17.
 */
public class BrowserConfiguration {

    @Bean
    public FireFox fireFox() {
        return new FireFox(fireFoxProfile());
    }

    @Bean
    public FireFoxProfile fireFoxProfile() {
        return new FireFoxProfile();
    }

}
