package es.unican.istr.sanchezbp.teaching.enterpriseSystems.iod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderHandler {

	protected NotificationSender sender;
	
	public OrderHandler() {
	}
	
	@Autowired
	@Qualifier("EmailNotifications")
	public void setSender(NotificationSender aSender) {
        this.sender = aSender;
    }
	
	public void processOrder( ) {
		User u = new User();
		if (sender == null) {
			System.out.println("Sender a null");
		} else { 
			this.sender.sendMessage("Orden creada",u);
		}
	}
	
}
