package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import testing.MyClass;

import static com.example.demo.Interop.*;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

       //MyClass m = new MyClass();
	   //m.foo();

		bar();


		SpringApplication.run(DemoApplication.class, args);
	}
}
