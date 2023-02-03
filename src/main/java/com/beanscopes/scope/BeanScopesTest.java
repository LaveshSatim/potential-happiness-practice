package com.beanscopes.scope;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanScopesTest {
	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(
				new ClassPathResource("com/beanscopes/scope/application-context.xml"));
		/*
		 * Machine m1 = beanFactory.getBean("machine", Machine.class); Machine m2 =
		 * beanFactory.getBean("machine", Machine.class);
		 * 
		 * System.out.println("m1 == m2 ? : " + (m1 == m2));
		 */
		DateConverter dc1 = beanFactory.getBean("dateConverter", DateConverter.class);
		DateConverter dc2 = beanFactory.getBean("dateConverter", DateConverter.class);

		System.out.println("dc1 == dc2 ? : " + (dc1 == dc2));

		DateConverter dc3 = DateConverter.getInstance();
		System.out.println("dc1 == dc3 ? : " + (dc1 == dc3));
	}
}
