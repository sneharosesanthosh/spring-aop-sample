package com.sample.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;


@SpringBootApplication
public class AopApplication {

	public static void main(String[] args) {
//		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		Car car = context.getBean(Car.class);

		ApplicationContext context = SpringApplication.run(AopApplication.class, args);
		Car car = context.getBean("car", Car.class);
		car.displayCar();

	}

}
