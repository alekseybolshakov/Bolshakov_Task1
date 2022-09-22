package tests;

import static constants.ConstantsForTests.*;

import constants.Currency;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import products.cards.CurrencyDebitCard;

public class CurrencyDebitCardTest {

    private CurrencyDebitCard card;

    @BeforeMethod
    public void setUp() {
        card = new CurrencyDebitCard(Currency.USD);
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
