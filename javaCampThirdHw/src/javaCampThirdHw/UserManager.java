package javaCampThirdHw;


public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+ " Kullanıcı eklendi");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+ " Kullanıcı silindi");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+ " Kullanıcı güncellendi");
	}

}