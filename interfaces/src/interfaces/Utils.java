package interfaces;

public class Utils {
	//�ok kullan�l�cak olanlar� utils te tan�mlayabiliriz
	public static void runLoggers(Logger[] loggers, String message) {
		for(Logger logger: loggers) {
			logger.log(message);
		}
	//diledi�im yerden �a�r�labilir hale getiriyoruz, loggerlar ve message de�i�ebilir
	}
}
