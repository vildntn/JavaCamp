package fifthAssignmentJavaCamp.business.concreates;

import fifthAssignmentJavaCamp.business.abstracts.AuthService;
import fifthAssignmentJavaCamp.business.abstracts.UserService;
import fifthAssignmentJavaCamp.business.abstracts.VerificationService;
import fifthAssignmentJavaCamp.core.abstracts.GoogleService;
import fifthAssignmentJavaCamp.entities.concreates.User;

public class AuthManager implements AuthService {
     private UserService userService;
     private VerificationService verificationService;
     private GoogleService googleService;

	public AuthManager(UserService userService, VerificationService verificationService,GoogleService googleService) {
		super();
		this.userService = userService;
		this.verificationService=verificationService;
		this.googleService=googleService;
	}

	@Override
	public boolean register(User user) {
		
		if(validateOfUserInfo(user)&&checkIfPassword(user)
				&& checkIfFullName(user)
				&& checkIfUserExist(user.getEmail())
				&& userService.checkIfEmailCorrect(user.getEmail())) {
			verificationService.verificateByCode();
			System.out.println("The user with the name "+user.getFirstName()+" has been registered. " );
			userService.add(user);

		}
		return false;
	}

	@Override
	public boolean login(User user) {
		boolean getEmail=userService.getByMail(user.getEmail());
		if(getEmail) {
			System.out.println("Successful login: " + user.getFirstName());
			return true;
		}
		else {
			System.out.println("No such user was found.");
		return false;
		}
	}

	
	private boolean checkIfFullName(User user) {
		if(user.getFirstName().length()>=2 &&user.getLastName().length()>=2) {
			return true;
		}else {
			System.out.println("Name and surname must be at least 2 characters.");
			return false;
		}
	}
	
	
	private boolean checkIfPassword(User user) {
		if(user.getPassword().length()>=6) {
			return true;
		}
		else {
			System.out.println("The password must be at least 6 characters.");
			return false;
		}
	
	}
	private boolean validateOfUserInfo(User user)  {
		try {
		if(!user.getEmail().isEmpty()&&!user.getFirstName().isEmpty()&&!user.getLastName().isEmpty()&&!user.getPassword().isEmpty()) {
			return true;
		}
		}
		catch (NullPointerException e) {
			System.out.println("Please enter all the information!");
			//throw e;
		}
		return false;
	}
	private boolean checkIfUserExist(String email) {
		if(userService.getByMail(email)) {
			System.out.println("This email address is already in use!");
			return false;
		}else {
			return true;
		}
	}

	
	@Override
	public void registerWithGoogle() {
		googleService.authToSystem();
		
	}
	

}
