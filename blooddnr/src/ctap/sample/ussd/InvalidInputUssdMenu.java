package ctap.sample.ussd;

import hms.kite.samples.api.ussd.OperationType;

public class InvalidInputUssdMenu implements UssdMenu{

	public String getContent() {		
		return "You have selected an invalid input";
	}

	public UssdMenu nextMenu(String input) {		
		return null;
	}

	public OperationType opType() {		
		return OperationType.MT_FIN;
	}

}
