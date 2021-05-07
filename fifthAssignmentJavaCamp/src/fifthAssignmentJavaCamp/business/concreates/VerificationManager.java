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
		System.out.println("Doðrulama kodu: "+getCode());
	      Scanner input=new Scanner(System.in);
	      System.out.print("Lütfen doðrulama kodunu giriniz: ");
	      String event=input.nextLine();
	      if(!code.equals(event)) {
	    	  System.out.println("Geçersiz kod girdiniz");
	      }
		
	}

}
