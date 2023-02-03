package com.beanautowiring.autowiring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanAutowiringTest {
	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(
				new ClassPathResource("com/beanautowiring/autowiring/application-context.xml"));
		Salesorder salesorder = beanFactory.getBean("salesorder", Salesorder.class);
		System.out.println(salesorder);
	}
}
