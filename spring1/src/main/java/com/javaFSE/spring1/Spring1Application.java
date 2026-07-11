package com.javaFSE.spring1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring1Application implements CommandLineRunner {

	@Autowired
	PaymentService service;

	public static void main(String[] args) {
		SpringApplication.run(Spring1Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		NotificationService NS = new SmsNotificationService();
		NS.send("You have new notification..");

	}

}
