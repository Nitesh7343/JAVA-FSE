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

		CakeBaker cake3 = factory.create("strawberryFrosting","strawberrySyrup");

		CakeBaker cake4 = factory.create("chocolateFrosting","strawberrySyrup");

		cake1.bake();
		cake2.bake();
		cake3.bake();
		cake4.bake();
	}

	public static void main(String[] args) {
		SpringApplication.run(AliceBakeryApplication.class, args);
	}

}
