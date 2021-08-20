package inheretance2;

public class Main {

	public static void main(String[] args) {
		//birbirinin alternatifi olan kod bloglarý için if yazýlmaz
		
		CustomerManager customerManager = new CustomerManager();
		
		customerManager.add(new EmailLogger());
	}

}
