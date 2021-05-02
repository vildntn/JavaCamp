package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		super();
		this.loggers = loggers;
	}
	
   
	public void add(Customer customer) {
		
		//loosly -tightly coupled
		System.out.println("Müþteri eklendi "+ customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName());
		
	}
	public void delete(Customer customer) {
		System.out.println("Müþteri silindi "+ customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName());
	
	}
}
