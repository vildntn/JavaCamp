package Concreate;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
    private CustomerCheckService customerCheckService;
    
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}
	@Override
	public void save(Customer customer)throws Exception {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);
		}
		else {
			System.out.println("Not a valid person.");
		}
		
	}

	
	
}
