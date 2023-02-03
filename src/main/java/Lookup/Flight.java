package Lookup;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public abstract class Flight {

	public void timeToFly() {

		IPlane iPlane = null;
		iPlane = plane();

		iPlane.engineStart();
	}

	@Lookup("jetFighter")
	public abstract IPlane plane();

}
