package Abstract;

import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public interface SalesService {
	public void sell(Customer customer,Campaign campaign, Game game);

}
