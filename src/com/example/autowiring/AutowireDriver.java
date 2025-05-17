package com.example.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireDriver {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/example/autowiring/applicationContext-byName.xml");
//        OrderService orderService = context.getBean("orderServiceByName", OrderService.class);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/example/autowiring/applicationContext-constructor.xml");
        OrderService orderService = context.getBean("orderServiceByConstructor", OrderService.class);
        orderService.placeOrder("A3LL",2);
        context.close();
    }
}
