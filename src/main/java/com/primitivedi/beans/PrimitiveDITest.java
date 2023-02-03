package com.primitivedi.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class PrimitiveDITest {
	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(
				new ClassPathResource("com/primitivedi/beans/application-context.xml"));
		Bike bike = beanFactory.getBean("bike", Bike.class);
		System.out.println(bike);
	}
}
