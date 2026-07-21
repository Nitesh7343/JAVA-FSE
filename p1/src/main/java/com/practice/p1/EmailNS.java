package com.practice.p1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Primary
@Qualifier("emailNS")
public class EmailNS implements NotificationService {

    @PostConstruct
    public void construct() {
        System.out.println("email Bean Created");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("email Bean will destroy");
    }

    public String send() {
        return "Notification Sent on Email";
    }
}
