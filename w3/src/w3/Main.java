package w3;

public class Main {

	public static void main(String[] args) {
		User student1 = new Student();
		student1.setId(1);
		student1.setFirstName("ilyas");
		student1.setLastName("KURT");
		student1.setEmail("ilyaskrt19@gmail.com");
		
		
		User instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("DEMIROG");
		instructor1.setEmail("engindemirog@gmail.com");
		
				
		UserManager userManager = new UserManager();
		userManager.add(student1);	
		userManager.delete(student1);
		userManager.update(student1);
		userManager.add(instructor1);	
		userManager.delete(instructor1);
		userManager.update(instructor1);
		
		StudentManager studentManager = new StudentManager();
		studentManager.addComment("güzel anlatim");
		studentManager.deleteComment();
		studentManager.updateComment();
	
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse(1);
		instructorManager.deleteCourse();
		instructorManager.updateCourse();

	}

}
