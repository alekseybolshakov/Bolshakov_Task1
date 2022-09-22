package strategies.withdraw_behavior;

import products.BankProduct;

public class CreditCardWithdrawal implements WithdrawBehavior {

    private static final double WITHDRAWAL_FEE = 1d;
    @Override
    public void withdraw(BankProduct card, double value) {
        double currentBalance = card.getBalance();
        double newBalance = currentBalance - value - WITHDRAWAL_FEE;
        card.setBalance(newBalance);
    }
}
