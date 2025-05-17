package com.example.autowiring;

public class NotificationService {

    private String notificationType = "Email";

    public NotificationService() {}

    public NotificationService(String notificationType) {
        this.notificationType = notificationType;
    }

    public void sendNotification(String message) {
        System.out.println("NotificationService (" + notificationType + "): Sending notification - " + message);
        // Actual notification sending logic
    }

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    public String getNotificationType() {
        return notificationType;
    }
}