package spring.annodation.config.spring.annodation.beanInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by muthuselvan on 10/29/17.
 */
public class BrowserMainApp {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BrowserConfiguration.class);
        FireFox fireFox = context.getBean(FireFox.class);
        fireFox.loadprofile();

    }
}
