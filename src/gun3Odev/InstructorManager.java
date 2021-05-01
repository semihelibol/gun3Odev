package gun3Odev;

public class InstructorManager extends UserManager {

	@Override
	public void login(User user) {
		System.out.println("Eðitmen giriþ yaptý: "+ user.geteMail());
	}
	
	public void add(Instructor instructor) {
		System.out.println("Eðitmen eklendi: "+instructor.getFirstName()+" "+instructor.getLastName());
	} 
	
	public void update(Instructor instructor) {
		System.out.println("Eðitmen güncellendi: "+instructor.getFirstName()+" "+instructor.getLastName());
	} 
	
	public void delete(Instructor instructor) {
		System.out.println("Eðitmen silindi: "+instructor.getFirstName()+" "+instructor.getLastName());
	} 
}

