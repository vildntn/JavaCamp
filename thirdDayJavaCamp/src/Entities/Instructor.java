package Entities;

public class Instructor extends User {
	private String givenCourse;
	
    public Instructor() {
		
	}

	
	public Instructor(int id, String firstName, String lastName, String email,String givenCourse) {
		super(id,firstName,lastName,email);
		this.givenCourse = givenCourse;
	}

	
	public String getGivenCourse() {
		return givenCourse;
	}

}
