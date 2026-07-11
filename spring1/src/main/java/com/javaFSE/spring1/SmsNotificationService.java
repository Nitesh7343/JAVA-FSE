package com.javaFSE.spring1;

public class SmsNotificationService implements NotificationService{

    @Override
    public void send(String message) {
        System.out.println("SMS Sent...... : "+ message);
    }
}
