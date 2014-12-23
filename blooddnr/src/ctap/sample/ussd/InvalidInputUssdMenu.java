package ctap.sample.ussd;

import hms.kite.samples.api.ussd.OperationType;

public class InvalidInputUssdMenu implements UssdMenu{

	public String getContent() {		
		return "You have provided an Invalid Input";
	}

	public UssdMenu nextMenu(String input) {
		// TODO Auto-generated method stub
		return null;
	}

	public OperationType opType() {
		// TODO Auto-generated method stub
		return OperationType.MT_FIN;
	}

}
