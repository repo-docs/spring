package com.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Initializing Spring context with Java configuration...");

        // 1. Create context from one or more @Configuration classes
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("\nRetrieving beans from context...");

        // Retrieve OrderService
        OrderService orderService = context.getBean("orderService", OrderService.class);
        orderService.placeOrder("PROD123", 5);

        // Retrieve NotificationService (to show it's the same instance if singleton)
        NotificationService ns1 = context.getBean("notificationService", NotificationService.class);
        NotificationService ns2 = context.getBean(NotificationService.class); // Can also get by type if unique
        System.out.println("Is ns1 == ns2? " + (ns1 == ns2)); // Should be true for singletons

        // Retrieve the bean with a custom name
        Integer maxAmount = context.getBean("maxOrderAmount", Integer.class);
        System.out.println("Maximum Order Amount: " + maxAmount);


        // Retrieve InventoryService and check its instance name
        InventoryService invService = context.getBean(InventoryService.class);
        invService.checkStock("TEST_PROD");


        System.out.println("\nClosing Spring context...");
        context.close(); // Closes the context and calls destroy methods if any
        System.out.println("Spring context closed.");
    }
}