package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new Smslogger(),new EmailLogger()};
		
		CustomerManager customerManager=new CustomerManager(loggers);
		
		Customer ilyas =new Customer(1,"Ýlyas","Kurt");
		
		customerManager.add(ilyas);
	}

}
