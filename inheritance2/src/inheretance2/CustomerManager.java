package inheretance2;

public class CustomerManager {
	//bir i� yapan s�n�f ba�ka bir i� yapan s�n�f� kullan�caksa somut s�n�ftan gilimez
	//file, database, e-mail gibi s�n�flar somut s�n�flar.
	//parametre olarak verdi�imizde bana logger�n�n ne oldu�unu s�yle demi� oluruz.
	// mainde �a��rd���nda belirtiyorsun hangi logger oldu�unu		
	public void add(Logger logger) {
		
		//m��teri ekleme kodlar�
		System.out.println("M��teri eklendi");
		
		
		logger.log();
	}
}
