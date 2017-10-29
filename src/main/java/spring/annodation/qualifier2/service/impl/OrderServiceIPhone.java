package spring.annodation.qualifier2.service.impl;

/**
 * Created by muthuselvan on 10/29/17.
 */
public class OrderServiceIPhone implements OrderServiceApple{

    @Override
    public void getOrder() {
        System.out.println("IPhone order by Revanth");
    }
}
