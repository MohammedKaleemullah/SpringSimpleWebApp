package com.kaleem.SimpleWebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SimpleWebAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SimpleWebAppApplication.class, args);

		Person person= (Person) context.getBean("Person");
		if (person.toString()!=null)
			System.out.println(person.toString());
	}

}
