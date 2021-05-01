package gun3Odev;

public class StudentManager extends UserManager {
	
	@Override
	public void login(User user) {
		System.out.println("Öğrenci giriş yaptı: "+ user.geteMail());
	}
	
	public void add(Student student) {
		System.out.println("Öğrenci eklendi: "+student.getFirstName()+" "+student.getLastName());
	} 
	
	public void update(Student student) {
		System.out.println("Öğrenci güncellendi: "+student.getFirstName()+" "+student.getLastName());
	} 
	
	public void delete(Student student) {
		System.out.println("Öğrenci silindi: "+student.getFirstName()+" "+student.getLastName());
	} 

}
