package com.example.annotation;

import com.example.annotation.base.Application;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/example/annotation/annotationApplicationContext.xml");
        CricketCoach cricketId = context.getBean("cricketId", CricketCoach.class);
        cricketId.displayType();

        Application application = context.getBean("application", Application.class);
        String appName = application.getName();
        System.out.println("appName = " + appName);
        context.close();
    }
}
