package fifthAssignmentJavaCamp;

import fifthAssignmentJavaCamp.business.concreates.AuthManager;
import fifthAssignmentJavaCamp.business.concreates.UserManager;
import fifthAssignmentJavaCamp.business.concreates.VerificationManager;
import fifthAssignmentJavaCamp.core.concreates.GoogleManagerAdapter;
import fifthAssignmentJavaCamp.dataAccess.concreates.InMemoryUserDao;
import fifthAssignmentJavaCamp.entities.concreates.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1=new User(1, "kullan?c?","birisi","kullan?c?@kullan?c?.com.tr","45678");
		
		User user2=new User(1, "deneme","denedim","akinb@itu.edu.tr","12345678");
		
		User user3=new User(1, "somebody","somewhere","something@something.com.tr","12345678");
		User user4=new User();
		user4.setFirstName("user");
		//user4.setLastName("user");
		user4.setPassword("123456");
		user4.setEmail("something@something.com.tr");


		AuthManager authManager=new AuthManager(new UserManager(new InMemoryUserDao()),new VerificationManager(), new GoogleManagerAdapter());
//		authManager.register(user1);
//		System.out.println("----------------------------");
//		authManager.register(user2);
//		System.out.println("----------------------------");
//		authManager.register(user3);
//		System.out.println("----------------------------");
		authManager.register(user4);
//		 
//		authManager.login(user1);
//		System.out.println("----------------------------");
//		authManager.login(user2);
//		System.out.println("----------------------------");
//
//		authManager.login(user3);
//		System.out.println("----------------------------");
	



	}

}
