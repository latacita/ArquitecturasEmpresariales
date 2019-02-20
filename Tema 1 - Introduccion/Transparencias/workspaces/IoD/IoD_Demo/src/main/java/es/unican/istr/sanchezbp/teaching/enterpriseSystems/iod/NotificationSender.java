package es.unican.istr.sanchezbp.teaching.enterpriseSystems.iod;

import org.springframework.stereotype.Component;

@Component
public abstract class NotificationSender {
	
	public abstract void sendMessage(String message, User u);

}
