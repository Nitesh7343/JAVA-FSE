package com.javaFSE.spring1;

public class EmailNotificationService implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println("Email Sent.... : "+ message);
    }
}
