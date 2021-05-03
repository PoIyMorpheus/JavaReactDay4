package Abstract;

import Entities.Campaign;

public interface CampaignService {
    void add(Campaign campaign);
    void update(Campaign campaign,int id,String name,String detail);
    void delete(Campaign campaign);
}
