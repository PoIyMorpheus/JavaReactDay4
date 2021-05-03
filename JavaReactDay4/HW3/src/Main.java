import Abstract.BaseCustomerManager;
import Abstract.CampaignService;
import Abstract.Product;
import Abstract.SalesService;
import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GamingCustomerManager;
import Concrete.SalesManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class Main {

    public static void main(String[] args) {
        BaseCustomerManager gamingCustomerManager= new GamingCustomerManager(new MernisServiceAdapter());
        SalesService salesManager= new SalesManager();
        CampaignService campaignManager= new CampaignManager();

        Customer customer= new Customer(1, "Recep Batuhan", "Dikmen",2001,"01234567890");
        Product game= new Game(2, "Nier Automata", 65);
        Campaign campaign= new Campaign(3, "The Witcher 3 Hediye!", "70 tl ve üzeri alışverişlerde The Witcher 3 hediye!");

        gamingCustomerManager.register(customer);
        gamingCustomerManager.update(customer,1, "Recep Batuhan", "Dikmen",2001,"01234567890");
        gamingCustomerManager.delete(customer);

        campaignManager.add(campaign);
        campaignManager.update(campaign,3, "The Witcher 3 Hediye!", "50 tl ve üzeri alışverişlerde The Witcher 3 hediye!");
        campaignManager.delete(campaign);

        salesManager.buy(customer, game);
        salesManager.buy(customer, game, campaign);
        salesManager.toReturn(customer, game);
    }
}
