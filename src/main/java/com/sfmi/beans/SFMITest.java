package com.sfmi.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class SFMITest {
	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/sfmi/beans/application-context.xml"));
		JobScheduler jobScheduler = beanFactory.getBean("jobScheduler", JobScheduler.class);
		System.out.println(jobScheduler);
	}
}
