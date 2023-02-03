package com.factorybeans.beans;

import java.util.Calendar;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class FactoryBeanTest {
	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(
				new ClassPathResource("com/factorybeans/beans/application-context.xml"));
		/*
		 * Meeting meeting = beanFactory.getBean("meeting", Meeting.class);
		 * System.out.println(meeting);
		 */
		Calendar calendar1 = beanFactory.getBean("meetingTime", Calendar.class);
		Calendar calendar2 = beanFactory.getBean("meetingTime", Calendar.class);

		System.out.println("calendar1 == calendar2 ? : " + (calendar1 == calendar2));
	}
}
