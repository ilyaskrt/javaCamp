package w3;

public class UserManager {
	public void add(User user) {
		System.out.println("Kullanýcý ekleme islemi basarili : " + user.getFirstName());
	}
	
	public void delete(User user) {
		System.out.println("Kullanýcý silme islemi basarili : " + user.getFirstName());
	}
	
	public void update(User user) {
		System.out.println("Kullanýcý güncelleme isleme basarili : " + user.getFirstName());
	}
}
