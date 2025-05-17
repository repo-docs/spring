package com.example.autowiring;

public class InventoryService {

    private String serviceName = "DefaultInventoryService";

    public InventoryService() {}

    public InventoryService(String serviceName) {
        this.serviceName = serviceName;
    }

    public void checkStock(String productId) {
        System.out.println(serviceName + ": Checking stock for product " + productId);
        // Actual stock checking logic would go here
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceName() {
        return serviceName;
    }
}