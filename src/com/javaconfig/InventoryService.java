package com.javaconfig;

public class InventoryService {
    private String serviceInstanceName;

    public InventoryService(String instanceName) {
        this.serviceInstanceName = instanceName;
        System.out.println("InventoryService '" + instanceName + "' created.");
    }

    public void checkStock(String productId) {
        System.out.println(serviceInstanceName + ": Checking stock for product " + productId);
    }
}