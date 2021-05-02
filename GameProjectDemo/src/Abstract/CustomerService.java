package Abstract;

import Entities.Customer;

public interface CustomerService {
	public void register(Customer customer);
	public void deleteAccount(Customer customer);
	public void updateAccount(Customer customer);
	

}
