package ctap.sample.ussd;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UssdInMemorySessionRepo implements UssdSessionRepo{

	private static final Map<String, UssdMenu> sessions = new ConcurrentHashMap<String,  UssdMenu>();
	
	public UssdMenu getMenu(String sessionId) {		
		return sessions.get(sessionId);
	}

	public void addMenu(String sessionId, UssdMenu ussdMenu) {
		sessions.put(sessionId, ussdMenu);
	}

}
