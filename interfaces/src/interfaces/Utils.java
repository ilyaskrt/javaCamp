package interfaces;

public class Utils {
	//çok kullanılıcak olanları utils te tanımlayabiliriz
	public static void runLoggers(Logger[] loggers, String message) {
		for(Logger logger: loggers) {
			logger.log(message);
		}
	//dilediğim yerden çağrılabilir hale getiriyoruz, loggerlar ve message değişebilir
	}
}
