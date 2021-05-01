package javaCampThirdHw;

public class InstructorManager {
	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+ " Egitmen eklendi");
	}
	
	public void delete(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+ " Egitmen silindi");
	}
	public void update(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+ " Egitmen güncellendi");
	}
}
