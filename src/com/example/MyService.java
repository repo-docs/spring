package com.example;

// In MyService.java
public class MyService {
    public void customInit() {
        System.out.println("MyService: Custom init method called.");
    }

    public void customDestroy() {
        System.out.println("MyService: Custom destroy method called.");
    }
}