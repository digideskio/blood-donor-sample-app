package ctap.sample.ussd;

import java.util.HashMap;
import java.util.Map;

import hms.kite.samples.api.ussd.OperationType;

public class BloodGroupUssdMenu implements UssdMenu{

	Map<String, String> context = new HashMap<String, String>();	
	Map<String, String> inputBloodGroup = new HashMap<String, String>();
	
	
	public BloodGroupUssdMenu(Map<String, String> context) {
		super();
		this.context = context;		
		inputBloodGroup.put("1","A");
		inputBloodGroup.put("2","B");
		inputBloodGroup.put("3","AB");
		inputBloodGroup.put("4","O");
	}

	public String getContent() {		
		return "Select your blood group\n 1. A\n 2. B\n 3.AB\n 4.O\n";
	}

	public UssdMenu nextMenu(String input) {	
		if(inputBloodGroup.keySet().contains(input)) {
			context.put("group", inputBloodGroup.get(input));
			return new RhesusFactorUssdMenu(context);
		} else {
			return new InvalidInputUssdMenu();
		}
	}

	public OperationType opType() {		
		return OperationType.MO_CONT;
	}

}
