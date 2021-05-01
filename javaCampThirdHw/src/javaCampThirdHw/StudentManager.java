package javaCampThirdHw;

public class StudentManager {
	public void add(Student student) {
		System.out.println(student.getFirstName()+" "+student.getLastName()+ " Ogrenci eklendi");
	}
	
	public void delete(Student student) {
		System.out.println(student.getFirstName()+" "+student.getLastName()+ " Ogrenci silindi");
	}
	public void update(Student student) {
		System.out.println(student.getFirstName()+" "+student.getLastName()+ " Ogrenci güncellendi");
	}

}
