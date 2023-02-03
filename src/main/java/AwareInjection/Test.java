package AwareInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext("AwareInjection");

		Drive drive = context.getBean(Drive.class);

		drive.go("suzukiCarImpl", "msg printed");
	}
}
