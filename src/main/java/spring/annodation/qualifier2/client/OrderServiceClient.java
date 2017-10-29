package spring.annodation.qualifier2.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import spring.annodation.qualifier2.service.impl.OrderServiceApple;

/**
 * Created by muthuselvan on 10/29/17.
 */
public class OrderServiceClient {
    @Autowired
    @Qualifier("iphone")
    private OrderServiceApple orderServiceApple;

    public void showOrderDetail() {
        orderServiceApple.getOrder();

    }
}
