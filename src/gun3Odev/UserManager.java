package gun3Odev;

public class UserManager {
	
	public void login(User user) {
		System.out.println("Kullanýcý giriþ yaptý: "+user.geteMail());
	}
	
	public void register(User user) {
		System.out.println("Kullanýcý eklendi: "+user.geteMail());
	}
		

}
