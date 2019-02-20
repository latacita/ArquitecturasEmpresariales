package es.unican.istr.sanchezbp.teaching.enterpriseSystems.iod;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("EmailNotifications")
public class EmailNotificationSender extends NotificationSender {

	@Override
	public void sendMessage(String message, User u) {
		System.out.println(message + "[sent by SMS]");
	}
	
}
