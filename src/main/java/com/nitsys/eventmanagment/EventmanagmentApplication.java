package com.nitsys.eventmanagment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.nitsys.controllers","com.nitsys.service"})
public class EventmanagmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventmanagmentApplication.class, args);
	}

}
