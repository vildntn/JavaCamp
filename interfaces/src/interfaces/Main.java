package interfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger [] logger= {new SmsLogger(), new EmailLogger(), new FileLogger()};
		CustomerManager customerManager=new CustomerManager(logger);
		Customer engin=new Customer(1, "Engin", "Demiroð");
		customerManager.add(engin);

	}

}
