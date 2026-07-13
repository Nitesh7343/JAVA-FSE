package com.javaFSE.spring1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring1Application implements CommandLineRunner {

	//@Autowired
	final NotificationService notificationServiceObj;

	public Spring1Application(/*@Qualifier("emailNS")*/ NotificationService notificationServiceObj) {
		this.notificationServiceObj = notificationServiceObj;
	}

	public static void main(String[] args) {
		SpringApplication.run(Spring1Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		//NS = new SmsNotificationService();
		notificationServiceObj.send("You have new notification..");

	}

}
