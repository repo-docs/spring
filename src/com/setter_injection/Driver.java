package com.setter_injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Driver {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Application setter = context.getBean("setter", Application.class);
        System.out.println("The name is " + setter.getName());
        System.out.println("The color is " + setter.getColor());
        Student student = setter.getStudent();
        student.sayHi();

        List<Color> list = setter.getColorList();
        Color color = list.get(2);
        color.displayColor();
        context.close();
    }
}
