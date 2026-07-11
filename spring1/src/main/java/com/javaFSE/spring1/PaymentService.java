package com.javaFSE.spring1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    void pay() {
        System.out.println("Paying......");
    }

    @PostConstruct
    void afterInit() {
        System.out.println("Before");
    }

    @PreDestroy
    void beforeDest() {
        System.out.println("After");
    }
}
