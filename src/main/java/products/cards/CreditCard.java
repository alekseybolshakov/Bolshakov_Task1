package products.cards;

import strategies.get_debt_behavior.GetCreditCardDebt;
import strategies.replenish_behavior.CreditCardReplenishment;
import strategies.withdraw_behavior.CreditCardWithdrawal;
import constants.Currency;

public class CreditCard extends Card {
    public CreditCard() {
        setCurrency(Currency.RUB);
        replenishBehavior = new CreditCardReplenishment();
        getDebtBehavior = new GetCreditCardDebt();
        withdrawBehavior = new CreditCardWithdrawal();
    }
}
