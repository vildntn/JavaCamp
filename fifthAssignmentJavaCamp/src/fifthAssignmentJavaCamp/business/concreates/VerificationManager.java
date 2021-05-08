package fifthAssignmentJavaCamp.business.concreates;
import java.util.Scanner;

import fifthAssignmentJavaCamp.business.abstracts.VerificationService;

public class VerificationManager implements VerificationService {
	private final String code="something";

	public String getCode() {
		return code;
	}

	@Override
	public void verificateByCode() {
		System.out.println("Verification Code: "+getCode());
	      Scanner input=new Scanner(System.in);
	      System.out.print("Please enter the verification code: ");
	      String event=input.nextLine();
	      if(!code.equals(event)) {
	    	  System.out.println("You entered an invalid code!");
	      }
		
	}

}
