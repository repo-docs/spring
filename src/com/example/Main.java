package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // 1. Load the Spring configuration file
        // ClassPathXmlApplicationContext looks for the file in the classpath.
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("Spring container initialized.");

        // 2. Retrieve the configured bean from the Spring container
        // Using the bean ID defined in the XML file
        GreetingService service1 = (GreetingService) context.getBean("greetingServiceBean1");

        // Or, more safely with type checking:
        GreetingService service2 = context.getBean("greetingServiceBean2", GreetingService.class);

        // 3. Use the bean
        System.out.print("Service 1 says: ");
        service1.sayGreeting();

        System.out.print("Service 2 says: ");
        service2.sayGreeting();

        MyService lifecycleDemoBean = context.getBean("lifecycleDemoBean", MyService.class);

        ReportService reportService = context.getBean("reportService", ReportService.class);
        reportService.generateReport();
        // Close the context (important in non-web applications to release resources)
        context.close();

        ClassPathXmlApplicationContext contextHolder = new ClassPathXmlApplicationContext("collectionHolderContext.xml");
        CollectionHolder collectionHolder = contextHolder.getBean("collectionHolder", CollectionHolder.class);
        collectionHolder.displayCollections();
        contextHolder.close();
    }
}
