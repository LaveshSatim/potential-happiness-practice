package AnnoLevel5ConfigurationXML_Stereo_JavaConfig;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan({ "AnnoLevel5ConfigurationXML_Stereo_JavaConfig" })
@PropertySource("classpath:AnnoLevel5ConfigurationXML_Stereo_JavaConfig/application.properties")
@ImportResource("classpath:AnnoLevel5ConfigurationXML_Stereo_JavaConfig/application-context.xml")
public class JavaConfig {

	@Autowired
	private Environment env;

	@Bean
	public AccountDetails accountDetails(@Value("accountHolderName") String name) {
		AccountDetails accountDetails = null;
		accountDetails = new AccountDetails();

//		accountDetails.setAccountHolderName(env.getProperty("accountHolderName"));
		accountDetails.setAccountHolderName(env.getProperty(name));
		accountDetails.setAccountNo(UUID.randomUUID().toString().substring(0, 7));

		return accountDetails;
	}
}
