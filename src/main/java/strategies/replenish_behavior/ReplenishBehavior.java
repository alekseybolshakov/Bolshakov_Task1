package strategies.replenish_behavior;

import products.BankProduct;

public interface ReplenishBehavior {

    void replenish(BankProduct card, double value);
}
