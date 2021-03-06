package fifthAssignmentJavaCamp.dataAccess.concreates;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import fifthAssignmentJavaCamp.dataAccess.abstracts.UserDao;
import fifthAssignmentJavaCamp.entities.concreates.User;

public class InMemoryUserDao implements UserDao{

	public ArrayList<User> userDao=new ArrayList<User>();
	

	@Override
	public void add(User user) {
		userDao.add(user);
		//System.out.println("User Added");
		
	}

	@Override
	public void delete(User user) {
		int userToRemove=userDao.indexOf(user);
		userDao.remove(userToRemove);
		//System.out.println("user Deleted");
		
	}

	@Override
	public void update(User user) {
		for (User newUser : userDao) {
			if(newUser.getId()==user.getId()) {
				newUser.setId(user.getId());
				newUser.setFirstName(user.getFirstName());
				newUser.setLastName(user.getLastName());
				newUser.setEmail(user.getEmail());
				newUser.setPassword(user.getPassword());
			}
			//System.out.println("user Updated");
		}
		
	}

	@Override
	public boolean getByMail(String email) {
	     return userDao.stream().anyMatch(u->u.getEmail().equals(email));
	    
	}

	@Override
	public User get(int id) {
         for (User user : userDao) {
			if(user.getId()==id) {
				return user;
			}
		}
		return null;
	}


}
