package ctap.sample.ussd;

import hms.kite.samples.api.ussd.OperationType;

public interface UssdMenu {
	
	String getContent();
	
	UssdMenu nextMenu(String input);
		
	OperationType opType();
}
