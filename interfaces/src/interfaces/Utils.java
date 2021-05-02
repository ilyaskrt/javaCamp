package interfaces;

public class Utils {
	//çok kullanýlýcak olanlarý utils te tanýmlayabiliriz
	public static void runLoggers(Logger[] loggers, String message) {
		for(Logger logger: loggers) {
			logger.log(message);
		}
	//dilediðim yerden çaðrýlabilir hale getiriyoruz, loggerlar ve message deðiþebilir
	}
}
