package strategies.replenish_behavior;

import products.BankProduct;

public class CreditCardReplenishment implements ReplenishBehavior {

    private static final double REPLENISHMENT_FEE = 1d;

    @Override
    public void replenish(BankProduct card, double value) {
        double initialBalance = card.getBalance();
        double newBalance = initialBalance + value - REPLENISHMENT_FEE;
        card.setBalance(newBalance);
    }
}
