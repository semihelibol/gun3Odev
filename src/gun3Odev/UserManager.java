package gun3Odev;

public class UserManager {
	
	public void login(User user) {
		System.out.println("Kullan�c� giri� yapt�: "+user.geteMail());
	}
	
	public void register(User user) {
		System.out.println("Kullan�c� eklendi: "+user.geteMail());
	}
		

}
