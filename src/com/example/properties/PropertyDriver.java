package com.example.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertyDriver {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/example/properties/propertiesContext.xml");
        SimpleDataSource myDataSource = context.getBean("myDataSource", SimpleDataSource.class);
        String url = myDataSource.getUrl();
        System.out.println("url = " + url);
        context.close();
    }
}
