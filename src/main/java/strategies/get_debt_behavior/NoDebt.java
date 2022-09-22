package strategies.get_debt_behavior;

import products.BankProduct;

public class NoDebt implements GetDebtBehavior {
    @Override
    public double getDebt(BankProduct card) {
        return 0;
    }
}
