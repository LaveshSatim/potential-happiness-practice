package Anno_required_anno_beanpostprocessor;

import org.springframework.beans.factory.annotation.Required;

public class School {

	private int stdNo;
	private String stdName;

	public int getStdNo() {
		return stdNo;
	}

	@Required
	public void setStdNo(int stdNo) {
		this.stdNo = stdNo;
	}

	public String getStdName() {
		return stdName;
	}

	@Required
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	@Override
	public String toString() {
		return "School [stdNo=" + stdNo + ", stdName=" + stdName + "]";
	}

}
