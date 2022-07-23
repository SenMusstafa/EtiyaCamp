package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	public void add(Customer customer) {
		System.out.println("Müşteri eklendi " + customer.getfirstName());
		
		Utils.runLggers(loggers, customer.getfirstName());
	}
	public void delete(Customer customer) {
		System.out.println("Müşteri silindi " + customer.getfirstName());
		
		Utils.runLggers(loggers, customer.getfirstName());
	}
}
