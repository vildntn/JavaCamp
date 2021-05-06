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
		User user1=new User(1, "kullanýcý","birisi","birisi@","45678");
		
		User user2=new User(1, "deneme","denedim","denendi@","12345678");
		
		User user3=new User(1, "somebody","somewhere","something@","12345678");


		AuthManager authManager=new AuthManager(new UserManager(new InMemoryUserDao()),new VerificationManager(), new GoogleManagerAdapter());
		authManager.register(user1);
		System.out.println("----------------------------");
		authManager.register(user2);
		System.out.println("----------------------------");
		authManager.register(user3);
		System.out.println("----------------------------");
		 
		authManager.login(user1);
		System.out.println("----------------------------");
		authManager.login(user2);
		System.out.println("----------------------------");

		authManager.login(user3);
		System.out.println("----------------------------");



	}

}
