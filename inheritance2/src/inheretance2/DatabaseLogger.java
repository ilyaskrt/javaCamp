package inheretance2;

public class DatabaseLogger extends Logger {
	//override i�lemi loggerdakinin �zerine yazma 
	//metod override denir
	
	@Override
	public void log() {
		System.out.println("Database logland�");
	}
}
