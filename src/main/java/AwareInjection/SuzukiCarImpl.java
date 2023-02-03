package AwareInjection;

import org.springframework.stereotype.Component;

@Component
public class SuzukiCarImpl implements Car {

	@Override
	public void engineStart(String name) {

		System.out.println("suzuki engine start : " + name);
	}

}
