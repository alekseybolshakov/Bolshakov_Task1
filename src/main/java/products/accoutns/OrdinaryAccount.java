package products.accoutns;

import strategies.close_behavior.OrdinaryAccountClosing;
import strategies.replenish_behavior.OrdinaryAccountReplenishment;
import constants.Currency;

public class OrdinaryAccount extends Account {

    public OrdinaryAccount() {
        setCurrency(Currency.RUB);
        replenishBehavior = new OrdinaryAccountReplenishment();
        closeBehavior = new OrdinaryAccountClosing();
    }
}
