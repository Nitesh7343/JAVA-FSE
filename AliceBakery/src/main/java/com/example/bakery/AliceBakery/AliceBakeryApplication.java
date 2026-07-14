package com.example.bakery.AliceBakery;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AliceBakeryApplication implements CommandLineRunner {
	private final CakeFactory factory;

	AliceBakeryApplication(CakeFactory factory) {
		this.factory = factory;
	}
	@Override
	public void run(String... args) throws Exception {
		CakeBaker cake1 = factory.create("chocolateFrosting","chocolateSyrup");

		CakeBaker cake2 = factory.create("strawberryFrosting","chocolateSyrup");

		cake1.bake();
		cake2.bake();
	}

	public static void main(String[] args) {
		SpringApplication.run(AliceBakeryApplication.class, args);
	}

}
