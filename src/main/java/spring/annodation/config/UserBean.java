package spring.annodation.config;

import org.springframework.context.annotation.Bean;

/**
 * Created by muthuselvan on 10/28/17.
 */
public class UserBean {


    @Bean
    public UserPojo userCon() {
        return new UserPojo();
    }

}
