package inheritance;

public class Main {

	public static void main(String[] args) {
	//miras yapısı
	
		IndividualCustomer ilyas = new IndividualCustomer();
		ilyas.customerNumber="19";  
		
		CorporateCustomer trend = new CorporateCustomer();
		trend.customerNumber="35";
		
		CustomerManager customerManager = new CustomerManager();
		//customerManager.add(ilyas);
		//customerManager.add(trend); 
		
		Customer[] customers = {ilyas,trend};
		customerManager.addMultiple(customers);
		
	}
	
}
