package gun3Odev;

public class Main {

	public static void main(String[] args) {

		User user1 = new User(1, "semih@elibol.com", "123456");

		User user2 = new User(2, "engin@demirog.com", "1234567");

		Instructor instructor1 = new Instructor(1, 2, "Engin", "Demiroğ", "MCT,PMP,ITIL", "Bir Efsane:)");

		Student student1 = new Student(1, 1, "Semih", "Elibol", "Yazılım Geliştirici");

		
		System.out.println("---------------------------");
		User[] users = { user1, user2 };

		UserManager[] usersManagers = new UserManager[] { new UserManager(), new StudentManager(),
				new InstructorManager() };

		for (UserManager userManager : usersManagers) {
			for (User user : users) {
				userManager.login(user);
			}
		}
		System.out.println("---------------------------");
		
		UserManager userManager = new UserManager();
		userManager.register(user1);
		userManager.login(user1);
		System.out.println("---------------------------");

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.login(user2);
		instructorManager.update(instructor1);
		instructorManager.delete(instructor1);
		System.out.println("---------------------------");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		studentManager.login(user1);
		studentManager.update(student1);
		studentManager.delete(student1);
		System.out.println("---------------------------");
		
		

	}

}
