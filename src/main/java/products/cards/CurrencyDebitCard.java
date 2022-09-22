package products.cards;

import strategies.get_debt_behavior.NoDebt;
import strategies.replenish_behavior.DebitCardReplenishment;
import strategies.withdraw_behavior.DebitCardWithdrawal;
import constants.Currency;

public class CurrencyDebitCard extends Card {

    private CurrencyDebitCard() {
    }

    public CurrencyDebitCard(Currency currency) {
        setCurrency(currency);
        replenishBehavior = new DebitCardReplenishment();
        getDebtBehavior = new NoDebt();
        withdrawBehavior = new DebitCardWithdrawal();
    }
}
