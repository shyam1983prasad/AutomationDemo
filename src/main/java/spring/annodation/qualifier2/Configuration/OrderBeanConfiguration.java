package spring.annodation.qualifier2.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.annodation.qualifier2.client.OrderServiceClient;
import spring.annodation.qualifier2.service.impl.OrderServiceApple;
import spring.annodation.qualifier2.service.impl.OrderServiceIPad;
import spring.annodation.qualifier2.service.impl.OrderServiceIPhone;

/**
 * Created by muthuselvan on 10/29/17.
 */
@Configuration
public class OrderBeanConfiguration {

    @Bean(name="ipad")
    public OrderServiceApple orderServiceIPad() {
        return new OrderServiceIPad();
    }

    @Bean(name="iphone")
    public OrderServiceApple orderServiceIPhone() {
        return new OrderServiceIPhone();
    }

    @Bean
    public OrderServiceClient orderServiceClient() {
        return new OrderServiceClient();
    }
}
