package products.accoutns;

import strategies.close_behavior.CloseBehavior;
import strategies.replenish_behavior.ReplenishBehavior;
import products.BankProduct;

public abstract class Account extends BankProduct {

    ReplenishBehavior replenishBehavior;
    CloseBehavior closeBehavior;

    public void performReplenishment(double value) {
        replenishBehavior.replenish(this, value);
    }

    public void performClosing() {
        closeBehavior.close(this);
    }

}
