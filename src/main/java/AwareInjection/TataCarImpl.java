package AwareInjection;

import org.springframework.stereotype.Component;

@Component
public class TataCarImpl implements Car {

	@Override
	public void engineStart(String name) {

		System.out.println("tata engine start : " + name);
	}

}
