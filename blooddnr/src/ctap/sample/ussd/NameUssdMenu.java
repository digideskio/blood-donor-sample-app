package ctap.sample.ussd;

import java.util.HashMap;
import java.util.Map;

import hms.kite.samples.api.ussd.OperationType;

public class NameUssdMenu implements UssdMenu{

	Map<String, String> context = new HashMap<String, String>();
	
	public NameUssdMenu(Map<String, String> context) {
		super();
		this.context = context;
	}	

	public String getContent() {		
		return "Enter your name :\n";
	}

	public UssdMenu nextMenu(String input) {		
		context.put("name", input);
		return new BloodGroupUssdMenu(context);
	}

	public OperationType opType() {		
		return OperationType.MT_CONT;
	}

}
