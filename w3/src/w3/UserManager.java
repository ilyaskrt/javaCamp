package w3;

public class UserManager {
	public void add(User user) {
		System.out.println("Kullan�c� ekleme islemi basarili : " + user.getFirstName());
	}
	
	public void delete(User user) {
		System.out.println("Kullan�c� silme islemi basarili : " + user.getFirstName());
	}
	
	public void update(User user) {
		System.out.println("Kullan�c� g�ncelleme isleme basarili : " + user.getFirstName());
	}
}
