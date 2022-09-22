package strategies.get_debt_behavior;

import products.BankProduct;

public class GetCreditCardDebt implements GetDebtBehavior {
    @Override
    public double getDebt(BankProduct card) {
        if (card.getBalance() >= 0) {
            return 0;
        } else {
            return card.getBalance();
        }
    }
}
