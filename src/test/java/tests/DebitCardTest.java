package tests;

import static constants.ConstantsForTests.*;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import products.cards.Card;
import products.cards.DebitCard;


public class DebitCardTest {

    private Card card;

    @BeforeMethod
    public void setUp() {
        card = new DebitCard();
    }

    @Test
    public void replenishmentTest() {
        card.performReplenishment(REPLENISHMENT_VALUE);
        double expectedBalance = REPLENISHMENT_VALUE;
        Assert.assertEquals(card.getBalance(), expectedBalance);
    }

    @Test
    public void withdrawalTest() {
        card.setBalance(POSITIVE_BALANCE_VALUE);
        card.performWithdrawal(WITHDRAWAL_VALUE);
        double expectedBalance = POSITIVE_BALANCE_VALUE - WITHDRAWAL_VALUE;
        Assert.assertEquals(card.getBalance(), expectedBalance);
    }

    @Test
    public void getBalanceTest() {
        card.setBalance(POSITIVE_BALANCE_VALUE);
        Assert.assertEquals(card.getBalance(), POSITIVE_BALANCE_VALUE);
    }

}
