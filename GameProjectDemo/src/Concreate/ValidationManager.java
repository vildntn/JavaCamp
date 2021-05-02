package Concreate;

import Abstract.ValidationService;
import Entities.Customer;

public class ValidationManager implements ValidationService{

	@Override
	public boolean checkIfCustomer(Customer customer) {
		if(customer.getIdentificationNumber().length()<11) {
			System.out.println("Identification number must be greater than 11.");
			return false;
		}else {
			return true;
			
		}
		
		
		
		
	}

}
