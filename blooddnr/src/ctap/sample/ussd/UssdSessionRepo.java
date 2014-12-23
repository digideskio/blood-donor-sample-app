package ctap.sample.ussd;

public interface UssdSessionRepo {
	
		UssdMenu getMenu(String sessionId);
	
		void addMenu(String sessionId, UssdMenu ussdMenu);
				
}