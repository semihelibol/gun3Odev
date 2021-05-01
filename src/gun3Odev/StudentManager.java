package gun3Odev;

public class StudentManager extends UserManager {
	
	@Override
	public void login(User user) {
		System.out.println("��renci giri� yapt�: "+ user.geteMail());
	}
	
	public void add(Student student) {
		System.out.println("��renci eklendi: "+student.getFirstName()+" "+student.getLastName());
	} 
	
	public void update(Student student) {
		System.out.println("��renci g�ncellendi: "+student.getFirstName()+" "+student.getLastName());
	} 
	
	public void delete(Student student) {
		System.out.println("��renci silindi: "+student.getFirstName()+" "+student.getLastName());
	} 

}
