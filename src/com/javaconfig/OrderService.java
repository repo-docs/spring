package com.javaconfig;

// @Autowired can still be used on constructors/setters/fields if preferred,
// even when beans are defined via @Bean methods.
// For this example, we'll inject dependencies through @Bean method calls.
public class OrderService {
    private final InventoryService inventoryService;
    private final NotificationService notificationService;

    // Constructor for dependency injection
    public OrderService(InventoryService inventoryService, NotificationService notificationService) {
        System.out.println("OrderService constructor called.");
        this.inventoryService = inventoryService;
        this.notificationService = notificationService;
    }

    public void placeOrder(String productId, int quantity) {
        System.out.println("OrderService: Placing order for product: " + productId + ", quantity: " + quantity);
        inventoryService.checkStock(productId);
        notificationService.sendNotification("Order placed for product " + productId);
    }
}