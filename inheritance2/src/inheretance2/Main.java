package inheretance2;

public class Main {

	public static void main(String[] args) {
		//birbirinin alternatifi olan kod bloglar� i�in if yaz�lmaz
		
		CustomerManager customerManager = new CustomerManager();
		
		customerManager.add(new EmailLogger());
	}

}
