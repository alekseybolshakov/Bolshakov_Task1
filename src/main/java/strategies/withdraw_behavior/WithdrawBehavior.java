package strategies.withdraw_behavior;

import products.BankProduct;

public interface WithdrawBehavior {

    void withdraw(BankProduct bankProduct, double value);
}
