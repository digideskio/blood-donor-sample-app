package ctap.sample.ussd;

import java.util.HashMap;
import java.util.Map;

import hms.kite.samples.api.ussd.OperationType;

public class RhesusFactorUssdMenu implements UssdMenu{

	Map<String, String> context = new HashMap<String, String>();
	Map<String, String> inputRhesus = new HashMap<String, String>();
	
	public RhesusFactorUssdMenu(Map<String, String> context) {
		super();
		this.context = context;
		inputRhesus.put("1", "POS");
		inputRhesus.put("2", "NEG");
	}

	public String getContent() {
		return "Select Your RhesusFactor.\n 1. POS(+)\n 2. NEG (-)\n";		
	}

	public UssdMenu nextMenu(String input) {
		if(inputRhesus.keySet().contains(input)) {
			context.put("rhesus", inputRhesus.get(input));
			return new DonorRegistrationSuccessUssdMenu(context);
		}
		return new InvalidInputUssdMenu();
	}

	public OperationType opType() {		
		return OperationType.MT_FIN;
	}

}
