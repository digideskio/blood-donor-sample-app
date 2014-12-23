package ctap.sample.ussd;

import hms.kite.samples.api.ussd.OperationType;

public class RhesusFactorUssdMenu implements UssdMenu{

	public String getContent() {
		return "Select Your RhesusFactor.\n 1. POS(+)\n 2. NEG (-)\n";		
	}

	public UssdMenu nextMenu(String input) {		
		return null;
	}

	public OperationType opType() {		
		return OperationType.MT_FIN;
	}

}
