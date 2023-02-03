package Lookup;

import org.springframework.stereotype.Component;

@Component
public class JetFighter implements IPlane {

	@Override
	public void engineStart() {

		System.out.println("jet fighter started");

	}

}
