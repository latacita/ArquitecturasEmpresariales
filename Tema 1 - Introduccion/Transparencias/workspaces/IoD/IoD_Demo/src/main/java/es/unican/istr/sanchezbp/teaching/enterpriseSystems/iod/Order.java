package es.unican.istr.sanchezbp.teaching.enterpriseSystems.iod;

public class Order {
	
	protected User user;
	
	public User getUser() {
		return user;
	}

	public Order(User u) {
		this.user = u;
	}

}
