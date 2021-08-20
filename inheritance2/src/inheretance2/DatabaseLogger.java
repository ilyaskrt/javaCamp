package inheretance2;

public class DatabaseLogger extends Logger {
	//override iþlemi loggerdakinin üzerine yazma 
	//metod override denir
	
	@Override
	public void log() {
		System.out.println("Database loglandý");
	}
}
