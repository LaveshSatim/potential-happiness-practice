package com.propertyeditors.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class PETest {
	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(
				new ClassPathResource("com/propertyeditors/beans/application-context.xml"));
		FacebookAccount fb = beanFactory.getBean("facebookAccount", FacebookAccount.class);
		System.out.println(fb);
	}
}
