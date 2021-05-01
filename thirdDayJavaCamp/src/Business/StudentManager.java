package Business;

import Entities.Student;
import Entities.User;

public class StudentManager extends UserManager{

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		//super.add(user);
		System.out.println(user.getFirstName()+" "+user.getLastName()+ " The Process is Successful");
	}

	public void delete(Student  student) {
		System.out.println(student.getFirstName()+" "+student.getLastName()+ " Kullanýcý Silindi");

	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		super.update(user);
	}
   
}
