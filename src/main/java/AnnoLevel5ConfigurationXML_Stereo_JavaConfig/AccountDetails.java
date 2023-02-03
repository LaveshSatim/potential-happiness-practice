package AnnoLevel5ConfigurationXML_Stereo_JavaConfig;

//no sources code
public class AccountDetails {

	private String accountNo;

	private String accountHolderName;

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	@Override
	public String toString() {
		return "AccountDetails [accountHolderName=" + accountHolderName + ", accountNo=" + accountNo + "]";
	}

}
