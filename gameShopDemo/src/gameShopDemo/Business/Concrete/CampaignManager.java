package gameShopDemo.Business.Concrete;

import gameShopDemo.Business.Abstract.CampaignService;

import gameShopDemo.Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName()+" kampanyası oluşturuldu.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName()+" kampanyası silindi.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName()+" kampanyası düzenlendi.");
		
	}

	
	

}
