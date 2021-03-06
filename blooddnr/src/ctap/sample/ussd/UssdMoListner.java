package ctap.sample.ussd;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import hms.kite.samples.api.SdpException;
import hms.kite.samples.api.ussd.MoUssdListener;
import hms.kite.samples.api.ussd.OperationType;
import hms.kite.samples.api.ussd.UssdRequestSender;
import hms.kite.samples.api.ussd.messages.MoUssdReq;
import hms.kite.samples.api.ussd.messages.MtUssdReq;

public class UssdMoListner implements MoUssdListener{

	UssdSessionRepo ussdSessionRepo;
	UssdRequestSender ussdRequestSender;
	String appstoreUssdReceiveUrl = "http://localhost:7000/ussd/send";
	
	String applicationId = "APP_000101";
	String password = "JIUIJ82929KJLKJLK";
	
	public void init() {
		ussdSessionRepo = new UssdInMemorySessionRepo();
        try {
            ussdRequestSender = new UssdRequestSender(new URL(appstoreUssdReceiveUrl));            
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

	public void onReceivedUssd(MoUssdReq moUssdReq) {
		
		System.out.println("###########" + moUssdReq);
		
		UssdMenu ussdMenu = null;
		if(moUssdReq.getUssdOperation().equals(OperationType.MO_INIT.getName())) {
			Map<String, String> context = new HashMap<String, String>();
			context.put("mobile", moUssdReq.getSourceAddress());
			ussdMenu = new WelcomeUssdMenu(context);	
		} else {
			UssdMenu curUssdMenu = ussdSessionRepo.getMenu(moUssdReq.getSessionId());
			ussdMenu = curUssdMenu.nextMenu(moUssdReq.getMessage());
		}
		
		ussdSessionRepo.addMenu(moUssdReq.getSessionId(),  ussdMenu);
		
		MtUssdReq mtUssdReq = new MtUssdReq();
		mtUssdReq.setApplicationId(applicationId);
		mtUssdReq.setPassword(password);
		mtUssdReq.setMessage(ussdMenu.getContent());
		mtUssdReq.setDestinationAddress(moUssdReq.getSourceAddress());
		mtUssdReq.setUssdOperation(ussdMenu.opType().getName());
		
		try {
			ussdRequestSender.sendUssdRequest(mtUssdReq);
		} catch (SdpException e) {			
			e.printStackTrace();
		}
	}		
}