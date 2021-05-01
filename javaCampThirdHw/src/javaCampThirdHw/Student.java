package javaCampThirdHw;


public class Student extends User {
	private String adddedCourse;
	
	public Student() {
		
	}

	public Student(int id, String firstName, String lastName, String email,String adddedCourse) {
		super(id,firstName,lastName,email);
		this.adddedCourse = adddedCourse;
	}

	public String getCourse() {
		return adddedCourse;
	}

	public void setCourse(String course) {
		this.adddedCourse = course;
	}
	
	

}