package com.ba.alias;

import java.util.stream.Stream;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BATest {
	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/ba/alias/application-context.xml"));
		Person p1 = beanFactory.getBean("person", Person.class);
		Person p2 = beanFactory.getBean("j carry", Person.class);

		System.out.println("p1 == p2 ? : " + (p1 == p2));
		System.out.println("p2 " + p2);

		String[] aliases = beanFactory.getAliases("person");
		Stream.of(aliases).forEach(System.out::println);
	}
}
