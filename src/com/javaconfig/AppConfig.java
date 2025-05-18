package com.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope; // For demonstrating scope

@Configuration // Marks this class as a source of bean definitions
public class AppConfig {

    // Defines a bean named 'notificationService' (method name by default)
    @Bean
    public NotificationService notificationService() {
        return new NotificationService(); // Creates and returns the bean instance
    }

    // Defines a bean named 'inventoryService'
    @Bean
    @Scope("singleton") // Explicitly setting scope (singleton is default anyway)
    public InventoryService inventoryService() {
        return new InventoryService("MainInventory"); // Creates and returns the bean instance
    }

    // Defines a bean named 'orderService'
    @Bean
    public OrderService orderService() {
        // Dependency Injection:
        // Call other @Bean methods to get dependencies.
        // Spring ensures that calling inventoryService() and notificationService() here
        // will return the Spring-managed singleton instances, not new objects each time.
        // This is because @Configuration classes are CGLIB proxied.
        InventoryService invService = inventoryService(); // Calls the @Bean method above
        NotificationService notifService = notificationService(); // Calls the @Bean method above

        return new OrderService(invService, notifService);
    }

    // Example of a bean with a custom name and primitive type
    @Bean(name = "maxOrderAmount")
    public Integer maximumOrderAmount() {
        return 1000;
    }
}