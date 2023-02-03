package com.pandcnamespace.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class PANDCNamespaceTest {
	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(
				new ClassPathResource("com/pandcnamespace/beans/application-context.xml"));
		Car car = beanFactory.getBean("car", Car.class);
		System.out.println(car);

	}
}
