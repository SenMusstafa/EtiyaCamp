package interfaces;


public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new DatabaseLogger(),new FileLogger(),new EmailLogger(),new SmsLogger()};
		
		
		CustomerManager customerManager = new CustomerManager(loggers);
		Customer engin = new Customer(1,"Engin", "Demiroğ");
		customerManager.add(engin);
	}

}
