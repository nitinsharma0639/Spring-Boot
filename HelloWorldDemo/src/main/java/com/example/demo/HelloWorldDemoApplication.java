package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HelloWorldDemoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(HelloWorldDemoApplication.class, args);
		HelloWorld hello = (HelloWorld) applicationContext.getBean("helloWorld");
		hello.say();
	}

}
