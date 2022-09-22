package strategies.replenish_behavior;

import products.BankProduct;

public class OrdinaryAccountReplenishment implements ReplenishBehavior {

    private static final double REPLENISHMENT_BONUS = 2d;

    @Override
    public void replenish(BankProduct card, double value) {
        double initialBalance = card.getBalance();
        double newBalance = initialBalance + value + REPLENISHMENT_BONUS;
        card.setBalance(newBalance);
    }
}
