package com.dependson.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class DonTest {
	public static void main(String[] args) throws Exception {
		BeanFactory beanFactory = new XmlBeanFactory(
				new ClassPathResource("com/dependson/beans/application-context.xml"));
		LoanManager loanManager = beanFactory.getBean("loanManager", LoanManager.class);

		double interestAmount = loanManager.interestAmount(100000, 12, "hyd");
		System.out.println("interest amount : " + interestAmount);
	}
}
