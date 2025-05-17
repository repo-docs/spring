package com.example.autowiring;

public class OrderService {

    // For byName autowiring, property names must match bean IDs/names
    private InventoryService inventoryService; // Property name is "inventoryService"
    private NotificationService notification; // Property name is "notification"

    // Constructor for autowire="constructor"
    // Spring will try to match arguments by type with existing beans
    public OrderService(InventoryService inventoryService, NotificationService notification) {
        System.out.println("OrderService constructor called with InventoryService and NotificationService.");
        this.inventoryService = inventoryService;
        this.notification = notification;
    }

    // Default constructor (might be needed if not using constructor autowiring or if Spring needs a choice)
    public OrderService() {
        System.out.println("OrderService default constructor called.");
    }

    // Setters (required for byName autowiring if not using constructor autowiring)
    public void setInventoryService(InventoryService inventoryService) {
        System.out.println("OrderService: setInventoryService called.");
        this.inventoryService = inventoryService;
    }

    public void setNotificationService(NotificationService notification) {
        System.out.println("OrderService: setNotificationService called.");
        this.notification = notification;
    }

    public void placeOrder(String productId, int quantity) {
        System.out.println("Placing order for product: " + productId + ", quantity: " + quantity);
        if (inventoryService != null) {
            inventoryService.checkStock(productId);
        } else {
            System.out.println("InventoryService not available.");
        }
        // ... order processing logic ...
        if (notification != null) {
            notification.sendNotification("Order placed for product " + productId);
        } else {
            System.out.println("NotificationService not available.");
        }
    }
}