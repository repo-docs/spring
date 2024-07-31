package com.scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/scope/applicationContextScope.xml");
        App app = context.getBean("app", App.class);
        App appTwo = context.getBean("appTwo", App.class);
        System.out.println(app.getName());
        System.out.println(appTwo.getName());

        context.close();
    }
}
