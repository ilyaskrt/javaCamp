package interfaces;

public class CustomerManager {

//filelogger kullan�lmak istenirse bir s�re sonra s�k�nt� olabilir
// CustomerManager loglamaya ba��ml�
//birden fazla log i�in dizi �eklinde tutar�z
	
	private Logger[] loggers;
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
		//custrocter dan geleni clas�n logger�na atad�k
	}
	
	public void add(Customer customer) {
		System.out.println("M��teri eklendi "+ customer.getFirstName());

	/*	DatabaseLogger logger= new DatabaseLogger();
		logger.log(customer.getFirstName()+ " veri taban� logland�"); */
		
	/*	utils te tan�mlad�k
	    for(Logger logger: loggers) {
			logger.log(customer.getFirstName());
		} 
		*/
		Utils.runLoggers(loggers, customer.getFirstName());
	}
	

	public void delete(Customer customer) {
		System.out.println("M��teri silindi"+customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());

		
	}
	

}
