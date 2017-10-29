package spring.annodation.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by muthuselvan on 10/28/17.
 */
public class UserMain {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(UserBean.class);
        UserPojo userPojo = ctx.getBean(UserPojo.class);
        userPojo.setUsername("muthu");
        System.out.println("Username : " +userPojo.getUsername());

    }
}
