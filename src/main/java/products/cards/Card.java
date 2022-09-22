package products.cards;

import products.BankProduct;
import strategies.withdraw_behavior.WithdrawBehavior;
import strategies.get_debt_behavior.GetDebtBehavior;
import strategies.replenish_behavior.ReplenishBehavior;

public abstract class Card extends BankProduct {

    protected ReplenishBehavior replenishBehavior;
    protected WithdrawBehavior withdrawBehavior;
    protected GetDebtBehavior getDebtBehavior;

    public void performReplenishment(double value) {
        replenishBehavior.replenish(this, value);
    }

    public void performWithdrawal(double value) {
        withdrawBehavior.withdraw(this, value);
    }

    public double performGettingDebt() {
        return getDebtBehavior.getDebt(this);
    }

}
