package com.ucdi.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class UCDITest {
	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/ucdi/beans/application-context.xml"));
		Contract contract = beanFactory.getBean("contract", Contract.class);
		System.out.println(contract);
	}
}
