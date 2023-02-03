package com.beanlifecycle.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanlifecycleTest {
	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(
				new ClassPathResource("com/beanlifecycle/beans/application-context.xml"));
		ShutdownHook shutdownHook = beanFactory.getBean("shutdownHook", ShutdownHook.class);

		Runtime.getRuntime().addShutdownHook(new Thread(shutdownHook));

		Rectangle rectangle = beanFactory.getBean("rectangle", Rectangle.class);
		System.out.println("area : " + rectangle);

		// ((ConfigurableListableBeanFactory)beanFactory).destroySingletons();
	}
}
