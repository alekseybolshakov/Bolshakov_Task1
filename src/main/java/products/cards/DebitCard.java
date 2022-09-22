package products.cards;

import strategies.get_debt_behavior.NoDebt;
import strategies.replenish_behavior.DebitCardReplenishment;
import strategies.withdraw_behavior.DebitCardWithdrawal;
import constants.Currency;

public class DebitCard extends Card {

    public DebitCard() {
        setCurrency(Currency.RUB);
        replenishBehavior = new DebitCardReplenishment();
        getDebtBehavior = new NoDebt();
        withdrawBehavior = new DebitCardWithdrawal();
    }
}
