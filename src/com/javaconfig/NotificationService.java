package com.javaconfig;
public class NotificationService {
    public NotificationService() {
        System.out.println("NotificationService created.");
    }

    public void sendNotification(String message) {
        System.out.println("NotificationService: Sending notification - " + message);
    }
}