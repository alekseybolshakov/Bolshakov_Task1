package strategies.withdraw_behavior;

import products.BankProduct;

public class DebitCardWithdrawal implements WithdrawBehavior {

    @Override
    public void withdraw(BankProduct card, double value) {
        card.setBalance(card.getBalance() - value);
    }
}
