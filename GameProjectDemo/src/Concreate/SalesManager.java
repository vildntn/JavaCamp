package Concreate;

import Abstract.SalesService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class SalesManager implements SalesService{

	@Override
	public void sell(Customer customer, Campaign campaign, Game game) {
		System.out.println(game.getGameName()+ "The game was purchased by: "+customer.getFirstName()+" with this campaign: "+ campaign.getCampaignName()+" Price: " +(game.getPrice()-(game.getPrice()*campaign.getDiscount()/100)));
		
	}

}
