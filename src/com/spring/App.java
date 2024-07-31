package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach baseball = context.getBean("baseball", Coach.class);
        baseball.displayFortune();
        Coach cricket = context.getBean("cricket", Coach.class);
        System.out.println("Baseball Coach " + baseball.workingHours());
        System.out.println("Cricket Coach " + cricket.workingHours());

        Coach track = context.getBean("track", Coach.class);
        System.out.println("Your track coach here - with setter Injection");
        track.displayFortune();

        LaptopForLiteralSetterInjection laptop = context.getBean("laptop", LaptopForLiteralSetterInjection.class);
        laptop.displaySpecs();
        context.close();
    }

}
