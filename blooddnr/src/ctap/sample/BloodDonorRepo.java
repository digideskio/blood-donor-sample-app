package ctap.sample;

import java.util.List;

public interface BloodDonorRepo {
	
	void addBloodDonor(BloodDonor donor);
	
	List<BloodDonor> bloodDonors(String bloodGroup,  String rhesus);
	
	List<BloodDonor> allDonors();
}
