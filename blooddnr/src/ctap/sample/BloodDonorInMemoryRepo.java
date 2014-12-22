package ctap.sample;

import java.util.ArrayList;
import java.util.List;

public class BloodDonorInMemoryRepo implements BloodDonorRepo{
	
	 private static final List<BloodDonor> donors = new ArrayList<BloodDonor>();
	
	 public void addBloodDonor(BloodDonor donor) {
		  donors.add(donor);
	 }
	 
	 public List<BloodDonor> bloodDonors(String bloodGroup,  String rhesus) {
		 List<BloodDonor> filteredDonors = new ArrayList<BloodDonor>();
		 for (BloodDonor bloodDonor : donors) {
			if(bloodDonor.getRhesusFactor().equals(rhesus) && bloodDonor.getBloodGroup().equals(bloodGroup)) {
				filteredDonors.add(bloodDonor);
			}
		}
		return filteredDonors; 
	 }
	 
	 public List<BloodDonor> allDonors() {
		 return donors;
	 }	 	
}
