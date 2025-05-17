package com.example;

public class GreetingService {

    private String message;

    // Constructor (optional, can be used for constructor injection)
    public GreetingService() {
    }

    // Constructor for constructor injection
    public GreetingService(String message) {
        this.message = message;
    }

    // Setter method for property injection
    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void sayGreeting() {
        System.out.println(getMessage());
    }
}