package AwareInjection;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Drive implements ApplicationContextAware {

	private ApplicationContext context;

	public void go(String carName, String msg) {

		Car bean = context.getBean(carName, Car.class);
		bean.engineStart(msg);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

		this.context = applicationContext;
	}

}
