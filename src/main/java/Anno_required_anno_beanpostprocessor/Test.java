package Anno_required_anno_beanpostprocessor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Test {

	public static void main(String[] args) {

//		ApplicationContext context = new ClassPathXmlApplicationContext(
//				"Anno_required_anno_beanpostprocessor/application-context.xml");
//
//		School school = context.getBean(School.class);
//		System.out.println(school);

		BeanFactory beanFactory = new XmlBeanFactory(
				new ClassPathResource("Anno_required_anno_beanpostprocessor/application-context.xml"));

		BeanPostProcessor beanPostProcessor = beanFactory.getBean("rbpp", BeanPostProcessor.class);

		((ConfigurableBeanFactory) beanFactory).addBeanPostProcessor(beanPostProcessor);

		School school = beanFactory.getBean("school", School.class);

		System.out.println(school);

		/*
		 * @required is deprecated in 5.0 this example shows us that we can configure
		 * bpp in our beanfactory <dependency> <groupId>org.springframework</groupId>
		 * <artifactId>spring-core</artifactId> <version>4.3.30.RELEASE</version>
		 * </dependency> <dependency> <groupId>org.springframework</groupId>
		 * <artifactId>spring-context</artifactId> <version>4.3.30.RELEASE</version>
		 * </dependency>
		 */

	}

}
