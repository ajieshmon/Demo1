package com.demo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.demo")
public class KubernateDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(KubernateDemo1Application.class, args);
	}

}
