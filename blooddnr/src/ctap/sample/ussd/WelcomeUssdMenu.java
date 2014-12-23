package ctap.sample.ussd;

import hms.kite.samples.api.ussd.OperationType;

import java.util.HashMap;
import java.util.Map;

public class WelcomeUssdMenu implements UssdMenu{

	public String getContent() {		
		return "Welcome to the blood donor application. \n1. Continue  \n2. About Us";
	}

	public UssdMenu nextMenu(String input) {
		if(input.trim().equals("1")) {
			return new BloodGroupUssdMenu();
		} else {
			return new InvalidInputUssdMenu();			
		}		
	}

	public OperationType opType() {		
		return OperationType.MT_CONT;
	}
	
}
