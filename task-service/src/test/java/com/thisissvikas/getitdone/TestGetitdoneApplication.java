package com.thisissvikas.getitdone;

import org.springframework.boot.SpringApplication;

public class TestGetitdoneApplication {

	public static void main(String[] args) {
		SpringApplication.from(GetitdoneApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
