package spring.annodation.qualifier2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.annodation.qualifier2.Configuration.OrderBeanConfiguration;
import spring.annodation.qualifier2.client.OrderServiceClient;

/**
 * Created by muthuselvan on 10/29/17.
 */
public class OrderMain {

    public static void main(String[] args) {
        ApplicationContext orderCtx = new AnnotationConfigApplicationContext(OrderBeanConfiguration.class);
        OrderServiceClient orderServiceClient = orderCtx.getBean(OrderServiceClient.class);
        orderServiceClient.showOrderDetail();
    }
}
