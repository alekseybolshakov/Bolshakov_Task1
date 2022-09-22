package tests;

import static constants.ConstantsForTests.*;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import products.accoutns.Account;
import products.accoutns.OrdinaryAccount;


public class OrdinaryAccountTest {

    private Account account;

    @BeforeMethod
    public void setUp() {
        account = new OrdinaryAccount();
    }

    @Test
    public void replenishmentTest() {
        account.performReplenishment(REPLENISHMENT_VALUE);
        double expectedBalance = REPLENISHMENT_VALUE + REPLENISHMENT_BONUS;
        double actualBalance = account.getBalance();
        Assert.assertEquals(actualBalance, expectedBalance);
    }

    @Test
    public void getBalanceTest() {
        Assert.assertEquals(account.getBalance(), EMPTY_BALANCE);
        account.setBalance(POSITIVE_BALANCE_VALUE);
        Assert.assertEquals(account.getBalance(), POSITIVE_BALANCE_VALUE);
    }

    @Test
    public void closingTest() {
        account.setBalance(POSITIVE_BALANCE_VALUE);
        account.setName(OrdinaryAccount.class.getName());
        account.performClosing();
        Assert.assertEquals(account.getBalance(), EMPTY_BALANCE);
        Assert.assertNull(account.getCurrency());
        Assert.assertNull(account.getName());
    }
}
