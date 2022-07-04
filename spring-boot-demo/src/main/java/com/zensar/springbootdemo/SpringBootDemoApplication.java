package com.zensar.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "test", "com.zensar" })
public class SpringBootDemoApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		System.out.println("Ram");

		SpringApplication.run(SpringBootDemoApplication.class, args);

		System.out.println("Laxman");
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return super.configure(builder);
	}

}
