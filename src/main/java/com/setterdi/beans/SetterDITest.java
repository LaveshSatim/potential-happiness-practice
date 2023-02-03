package com.setterdi.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class SetterDITest {

	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(
				new ClassPathResource("com/setterdi/beans/application-context.xml"));
		WaterPump waterPump = beanFactory.getBean("waterPump", WaterPump.class);
		waterPump.on();
	}

}
