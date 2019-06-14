package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.app")
public class AppStater {
	public static void main(String[] args) {
		SpringApplication s=new SpringApplication Object ac = s.run(args);

		System.out.println(ac.getClass().getName());
		System.out.println(ac.getBeen("product"));
		System.out.println(ac.getBeen("info"));
		
}
}
