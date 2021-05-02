package Concreate;

import Abstract.CustomerService;
import Abstract.ValidationService;
import Entities.Customer;

public class CustomerManager implements CustomerService {
	ValidationService validationService;
	public CustomerManager(ValidationService validationService) {
		this.validationService=validationService;
	}

	@Override
	public void register(Customer customer) {
		if(validationService.checkIfCustomer(customer)) {
	   System.out.println(customer.getFirstName()+customer.getLastName()+ " Successfully Registered ");
		
		}else {
			System.out.println("Registration failed");
		}
	}

	@Override
	public void deleteAccount(Customer customer) {
		System.out.println(customer.getFirstName()+customer.getLastName()+ " The Account Deleted ");
		
	}

	@Override
	public void updateAccount(Customer customer) {
		System.out.println(customer.getFirstName()+customer.getLastName()+ " The Account Updated");
		
	}

}
