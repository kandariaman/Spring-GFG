package com.SpringGFG.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext app = SpringApplication.run(DemoApplication.class, args);

		String[] s = app.getBeanDefinitionNames();
//		Arrays.stream(s).forEach(System.out::println);

	}

}
