package interfaces;

public class CustomerManager {

//filelogger kullanýlmak istenirse bir süre sonra sýkýntý olabilir
// CustomerManager loglamaya baðýmlý
//birden fazla log için dizi þeklinde tutarýz
	
	private Logger[] loggers;
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
		//custrocter dan geleni clasýn loggerýna atadýk
	}
	
	public void add(Customer customer) {
		System.out.println("Müþteri eklendi "+ customer.getFirstName());

	/*	DatabaseLogger logger= new DatabaseLogger();
		logger.log(customer.getFirstName()+ " veri tabaný loglandý"); */
		
	/*	utils te tanýmladýk
	    for(Logger logger: loggers) {
			logger.log(customer.getFirstName());
		} 
		*/
		Utils.runLoggers(loggers, customer.getFirstName());
	}
	

	public void delete(Customer customer) {
		System.out.println("Müþteri silindi"+customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());

		
	}
	

}
