package inheretance2;

public class CustomerManager {
	//bir iþ yapan sýnýf baþka bir iþ yapan sýnýfý kullanýcaksa somut sýnýftan gilimez
	//file, database, e-mail gibi sýnýflar somut sýnýflar.
	//parametre olarak verdiðimizde bana loggerýnýn ne olduðunu söyle demiþ oluruz.
	// mainde çaðýrdýðýnda belirtiyorsun hangi logger olduðunu		
	public void add(Logger logger) {
		
		//müþteri ekleme kodlarý
		System.out.println("Müþteri eklendi");
		
		
		logger.log();
	}
}
