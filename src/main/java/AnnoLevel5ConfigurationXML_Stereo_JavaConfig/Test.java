package AnnoLevel5ConfigurationXML_Stereo_JavaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Bank bean = context.getBean(Bank.class);
		
		bean.getInfo();
	}

}
