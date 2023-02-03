package Ano_stereo_depends_on;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("Ano_stereo_depends_on")
@DependsOn("emp")
public class Office {

	public Office() {
		System.out.println("office instantiated");
	}
}
