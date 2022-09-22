package strategies.close_behavior;

import products.BankProduct;

public class OrdinaryAccountClosing implements CloseBehavior {

    @Override
    public void close(BankProduct account) {
        account.setBalance(0);
        account.setCurrency(null);
        account.setName(null);
    }
}
