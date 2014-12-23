package ctap.sample.ussd;

import java.util.HashMap;
import java.util.Map;

import ctap.sample.BloodDonor;
import ctap.sample.BloodDonorInMemoryRepo;
import ctap.sample.BloodDonorRepo;
import hms.kite.samples.api.ussd.OperationType;

public class DonorRegistrationSuccessUssdMenu implements UssdMenu {

	Map<String, String> context = new HashMap<String, String>();			
	BloodDonorRepo bloodDonorRepo = new BloodDonorInMemoryRepo();
	
	public DonorRegistrationSuccessUssdMenu(Map<String, String> context) {
		super();
		this.context = context;
	}

	public String getContent() {
		bloodDonorRepo.addBloodDonor(new BloodDonor(context.get("msisdn"), context.get("name"), context.get("group"), context.get("rhesus")));
		return "Your registration is successful\n Blood Group : " + context.get("group")  + " Rhesus : " + context.get("rhesus")  + "\n" ;
	}

	public UssdMenu nextMenu(String input) {		
		return null;
	}

	public OperationType opType() {		
		return OperationType.MT_FIN;
	}

}
