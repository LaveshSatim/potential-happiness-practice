package AnnoLevel5ConfigurationXML_Stereo_JavaConfig;

//xml
public class UserDetails {

	private String balance;

	private String location;

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "UserDetails [balance=" + balance + ", location=" + location + "]";
	}

}
