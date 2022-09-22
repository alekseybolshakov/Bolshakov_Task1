package strategies.replenish_behavior;

import products.BankProduct;

public class DebitCardReplenishment implements ReplenishBehavior {

    @Override
    public void replenish(BankProduct card, double value) {
        card.setBalance(card.getBalance() + value);
    }
}
