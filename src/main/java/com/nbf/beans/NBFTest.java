package com.nbf.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class NBFTest {
	public static void main(String[] args) {
		BeanFactory parentFactory = new XmlBeanFactory(new ClassPathResource("com/nbf/beans/parent-beans.xml"));
		BeanFactory childFactory = new XmlBeanFactory(new ClassPathResource("com/nbf/beans/child-beans.xml"),
				parentFactory);

		Motor motor = childFactory.getBean("motor", Motor.class);
		System.out.println(motor);
	}
}
