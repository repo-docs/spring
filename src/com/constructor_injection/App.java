package com.constructor_injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Color color = context.getBean("colorId", Color.class);
        color.displayColor();
        context.close();
    }


}
