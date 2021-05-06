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
		if(CheckIfPassword(user)&& CheckIfFullName(user)&& checkIf(user.getEmail())&& !userService.checkIfEmailCorrect(user.getEmail())) {
			verificationService.verificateByCode();
			System.out.println("Kayýt olma baþarýlý: "+ user.getFirstName());
			userService.add(user);
			
		}
		return false;
	}

	@Override
	public boolean login(User user) {
		boolean getEmail=userService.getByMail(user.getEmail());
		if(getEmail) {
			System.out.println("Baþarýlý giriþ : " + user.getFirstName());
			return true;
		}
		else {
			System.out.println("Böyle bir kullanýcý bulunamadý");
		return false;
		}
	}

	
	private boolean CheckIfFullName(User user) {
		if(user.getFirstName().length()>=2 &&user.getLastName().length()>=2) {
			return true;
		}else {
			System.out.println("Ad ve soyad en az 2 karakterden oluþmalýdýr.");
			return false;
		}
	}
	
	
	private boolean CheckIfPassword(User user) {
		if(user.getPassword().length()>=6) {
			return true;
		}
		else {
			System.out.println("Parola en az 6 karakterden oluþmalýdýr.");
			return false;
			
		}
	
	}
	private boolean checkIf(String email) {
		if(userService.getByMail(email)) {
			System.out.println("Bu Email adresi zaten kullanýlýyor");
			return false;
		}else {
			return true;
		}
	}
	

}
