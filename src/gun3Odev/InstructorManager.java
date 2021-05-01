package gun3Odev;

public class InstructorManager extends UserManager {

	@Override
	public void login(User user) {
		System.out.println("E�itmen giri� yapt�: "+ user.geteMail());
	}
	
	public void add(Instructor instructor) {
		System.out.println("E�itmen eklendi: "+instructor.getFirstName()+" "+instructor.getLastName());
	} 
	
	public void update(Instructor instructor) {
		System.out.println("E�itmen g�ncellendi: "+instructor.getFirstName()+" "+instructor.getLastName());
	} 
	
	public void delete(Instructor instructor) {
		System.out.println("E�itmen silindi: "+instructor.getFirstName()+" "+instructor.getLastName());
	} 
}

