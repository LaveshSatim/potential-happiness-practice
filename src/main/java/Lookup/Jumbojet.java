package Lookup;

import org.springframework.stereotype.Component;

@Component("jumbojet")
public class Jumbojet implements IPlane {

	@Override
	public void engineStart() {

		System.out.println("jumboJet Started");
	}

}
