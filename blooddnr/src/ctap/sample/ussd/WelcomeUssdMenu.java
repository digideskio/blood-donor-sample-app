package ctap.sample.ussd;

import hms.kite.samples.api.ussd.OperationType;

import java.util.HashMap;
import java.util.Map;

public class WelcomeUssdMenu implements UssdMenu{
	
	Map<String, String> context = new HashMap<String, String>();	

	public WelcomeUssdMenu(Map<String, String> context) {
		super();
		this.context = context;
	}

	public String getContent() {		
		return "Welcome to the blood donor application. \n1. Continue  \n2. About Us";
	}

	public UssdMenu nextMenu(String input) {		
		return null;
	}

	public OperationType opType() {		
		return OperationType.MT_CONT;
	}
	
	
}
