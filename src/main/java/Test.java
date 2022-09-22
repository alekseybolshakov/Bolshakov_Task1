import products.accoutns.Account;
import products.accoutns.OrdinaryAccount;
import products.cards.Card;
import products.cards.CreditCard;

public class Test {
    public static void main(String[] args) {
        Account account = new OrdinaryAccount();
//        account.setBalance(10);
//        account.performReplenishment(5);
        System.out.println(account.getBalance());
    }
}
