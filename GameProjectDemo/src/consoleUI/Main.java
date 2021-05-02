package consoleUI;

import java.util.Scanner;


import Concreate.CampaignManager;
import Concreate.CustomerManager;
import Concreate.GameManager;
import Concreate.SalesManager;
import Concreate.ValidationManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		CampaignManager campaignManager=new CampaignManager();
		CustomerManager customerManager=new CustomerManager(new ValidationManager());
		SalesManager salesManager=new SalesManager();
		GameManager gameManager=new GameManager();
		
		
		Game game1=new Game(1, "Red Dead Redemption 2 PS4 ",268);
		Campaign campaign1=new Campaign(1, "Black Friday",50);
		Customer customer1=new Customer(1, "Ece "," Yalcýn","12345678914","1998");
		customerManager.register(customer1);
		campaignManager.add(campaign1);
		gameManager.add(game1);
		salesManager.sell(customer1,campaign1,game1);
		
		
		
		

	}

}
