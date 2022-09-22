package tests;

import static constants.ConstantsForTests.*;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import products.cards.Card;
import products.cards.CreditCard;

public class CreditCardTest {

    private Card card;

    @BeforeMethod
    public void setUp() {
        card = new CreditCard();
    }

    @Test
    public void replenishmentTest() {
        card.performReplenishment(REPLENISHMENT_VALUE);
        double expectedBalance = REPLENISHMENT_VALUE - REPLENISHMENT_FEE;
        Assert.assertEquals(card.getBalance(), expectedBalance);
    }

    @Test
    public void withdrawalTest() {
        card.setBalance(POSITIVE_BALANCE_VALUE);
        card.performWithdrawal(WITHDRAWAL_VALUE);
        double expectedBalance = POSITIVE_BALANCE_VALUE - WITHDRAWAL_VALUE - WITHDRAWAL_FEE;
        Assert.assertEquals(card.getBalance(), expectedBalance);
    }

    @Test
    public void getBalanceTest() {
        card.setBalance(POSITIVE_BALANCE_VALUE);
        Assert.assertEquals(card.getBalance(), POSITIVE_BALANCE_VALUE);
    }

    @Test
    public void getDebtTest() {
        Assert.assertEquals(card.performGettingDebt(), NO_DEBT);
        card.setBalance(POSITIVE_BALANCE_VALUE);
        Assert.assertEquals(card.performGettingDebt(), NO_DEBT);
        card.setBalance(NEGATIVE_BALANCE_VALUE);
        Assert.assertEquals(card.performGettingDebt(), NEGATIVE_BALANCE_VALUE);
    }
}
