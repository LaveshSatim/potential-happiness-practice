package AnnoLevel5ConfigurationXML_Stereo_JavaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//source code
@Component
public class Bank {

	@Autowired
	private UserDetails userDetails;

	@Autowired
	private AccountDetails accountDetails;

	public void getInfo() {
		System.out.println(userDetails);
		System.out.println(accountDetails);
	}
}
