package Lookup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext("Lookup");

		Flight flight = context.getBean("flight", Flight.class);

		System.out.println("fd");

		flight.timeToFly();
	}

}
