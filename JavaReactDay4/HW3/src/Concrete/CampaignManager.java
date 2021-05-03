package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {
    @Override
    public void add(Campaign campaign) {
        System.out.println(campaign.getName()+" adlı kampanya eklendi.");
    }

    @Override
    public void update(Campaign campaign,int id,String name,String detail) {
        campaign.setId(id);
        campaign.setName(name);
        campaign.setDetail(detail);

        System.out.println(campaign.getName()+" adlı kampanya güncellendi.");
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println(campaign.getName()+" adlı kampanya silindi.");
    }
}
