package interfaces;

public class Smslogger implements Logger {
	// implemente etmek demek logger � smslogger a uyarla demi� olduk

	@Override
	public void log(String message) {
	System.out.println("Sms g�nderildi: " + message);
	}
	
}
