package com.ifmi.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class IFMITest {
	public static void main(String[] args) {
		BeanFactory beanFactory = new DefaultListableBeanFactory();
		BeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(
				(DefaultListableBeanFactory) beanFactory);
		xmlBeanDefinitionReader.loadBeanDefinitions(new ClassPathResource("com/ifmi/beans/application-context.xml"));

		GetStockPriceController getStockPriceController = beanFactory.getBean("getStockPriceController",
				GetStockPriceController.class);
		double price = getStockPriceController.findStockPrice("cipla");
		System.out.println("price : " + price);
	}
}
