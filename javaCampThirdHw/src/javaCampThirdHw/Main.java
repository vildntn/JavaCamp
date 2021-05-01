package javaCampThirdHw;

public class Main {

	public static void main(String[] args) {
		String[] courses= {"C#&Angular","Java&React"};
		Student student1=new Student(1, "Adam","Smith","adam@adam.com","Java&React");

		Instructor instructor1=new Instructor();
		instructor1.setFirstName("Engin");
		instructor1.setEmail("engin@engin.com");
		instructor1.setLastName("Demirog");
		instructor1.setId(1);
		instructor1.setGivenCourse(courses);
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.add(instructor1);
		StudentManager studentManager=new StudentManager();
		studentManager.add(student1);

	}

}
