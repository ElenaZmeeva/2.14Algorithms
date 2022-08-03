package com.example2.Algorithms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		StringListInterface stringList = new StringListImpl();
		stringList.add("1");
		stringList.add("2");
		stringList.add("3");
		stringList.add("4");


		SpringApplication.run(Application.class, args);
	}

}
