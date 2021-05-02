package Concreate;
import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+ " campaign has been added as a new campaign.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("The "+campaign.getCampaignName()+ " campaign has been deleted.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("The "+ campaign.getCampaignName()+ " campaign has been updated.");
		
	}

}

