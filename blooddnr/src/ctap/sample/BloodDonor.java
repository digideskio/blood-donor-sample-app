package ctap.sample;

public class BloodDonor {
	private final String mobileNumber;
	private final String fullName;
	private final String bloodGroup;
	private final String rhesusFactor;
	public BloodDonor(String mobileNumber, String fullName,
			String bloodGroup, String rhesusFactor) {
		super();
		this.mobileNumber = mobileNumber;
		this.fullName = fullName;
		this.bloodGroup = bloodGroup;
		this.rhesusFactor = rhesusFactor;
	}
	
	public String getMobileNumber() {
		return mobileNumber;
	}

	public String getFullName() {
		return fullName;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public String getRhesusFactor() {
		return rhesusFactor;
	}

}
