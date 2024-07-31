package com.autowire;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/autowire/applicationContextAutowire.xml");
        Table table = context.getBean("table", Table.class);
        table.function();

        context.close();
    }
}
