import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concreate.NeroCustomerManager;
import Concreate.StarbucksCustomerManager;
import Entities.Customer;


public class Main {

	public static void main(String[] args) {
		Customer customer=new Customer();
		customer.setFirstName("Ece");
		customer.setLastName("Çetin");
		customer.setDateOfBirth(LocalDate.of(1998,04,9));
		customer.setId(1);
		customer.setNationalityId("12345678915");
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		try {
			customerManager.save(customer);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
