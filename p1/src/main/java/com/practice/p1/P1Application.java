package com.practice.p1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class P1Application implements CommandLineRunner {

	final NotificationService NS;

	P1Application(@Qualifier("smsNS") NotificationService NS) {
		this.NS = NS;
	}

	public static void main(String[] args) {
		SpringApplication.run(P1Application.class, args);
	}

	public void run(String... args) throws Exception{
		System.out.println(NS.send());
	}
}
