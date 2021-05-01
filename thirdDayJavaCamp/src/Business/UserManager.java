package Business;

import Entities.User;

public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+ " Kullanýcý eklendi");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+ " Kullanýcý silindi");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+ " Kullanýcý güncellendi");
	}

}
