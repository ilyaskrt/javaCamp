package interfaces;

public class Smslogger implements Logger {
	// implemente etmek demek logger ý smslogger a uyarla demiþ olduk

	@Override
	public void log(String message) {
	System.out.println("Sms gönderildi: " + message);
	}
	
}
