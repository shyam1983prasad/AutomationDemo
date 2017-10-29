package spring.annodation.qualifier;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.annotation.Resource;

/**
 * Created by muthuselvan on 10/29/17.
 */
public class FirefoxMain {



    public static void main(String[] args) {
//
        ApplicationContext context = new AnnotationConfigApplicationContext(FirefoxVersionBean.class);
        FirefoxRunner firefoxRunner = context.getBean(FirefoxRunner.class);
        firefoxRunner.setVersion("100");
        System.out.println("Firefox version for runner " +firefoxRunner.getVersion());




    }
}
