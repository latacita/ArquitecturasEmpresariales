package es.unican.istr.sanchezbp.teaching.enterpriseSystems.iod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class OrderHandler {

	@Autowired
	protected NotificationSender sender;
	
	public OrderHandler() {
	}
	
	public void processOrder(Order o) {
		this.sender.sendMessage("Order accepted",o.getUser());
	}
	
}
