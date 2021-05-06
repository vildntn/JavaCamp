package fifthAssignmentJavaCamp.business.concreates;

import fifthAssignmentJavaCamp.business.abstracts.UserService;
import fifthAssignmentJavaCamp.dataAccess.abstracts.UserDao;
import fifthAssignmentJavaCamp.entities.concreates.User;

public class UserManager implements UserService{
	public static final String emailPattern="^[A-Z0-9.%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	UserDao userDao;
	
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		userDao.add(user);
		
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
		
	}
	


	@Override
	public boolean getByMail(String email) {
		return userDao.getByMail(email);
		
	}

	@Override
	public boolean checkIfEmailCorrect(String email) {
		if(!email.matches(emailPattern)) {
			System.out.println("Geçerli bir mail adresi giriniz");
		
			return false;
		}
		else {
			System.out.println("Mail Adresi Doðru");
			return true;
		}
		
	}

	
	
	 

}
