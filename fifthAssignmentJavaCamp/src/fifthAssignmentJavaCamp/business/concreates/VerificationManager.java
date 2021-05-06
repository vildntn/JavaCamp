package fifthAssignmentJavaCamp.business.concreates;
import java.util.Scanner;

import fifthAssignmentJavaCamp.business.abstracts.VerificationService;

public class VerificationManager implements VerificationService {
	final String code="something";

	@Override
	public void verificateByCode() {
		System.out.println("Doðrulama kodu: "+code);
	      Scanner input=new Scanner(System.in);
	      System.out.print("Lütfen doðrulama kodunu giriniz: ");
	      String event=input.nextLine();
	      if(!code.equals(event)) {
	    	  System.out.println("Geçersiz kod girdiniz");
	      }
		
	}

}
