package ru.netology.unit;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BonusServiceTest {

    @Test
    void calculateBonusAmount2000() {
        BonusService service = new BonusService();
        int amount = 2000;
        int expected = 10;
        int actual = service.calculateBonus(amount);

        Assert.assertEquals(expected, actual);

    }

    @Test
    void calculateBonusAmount1000() {
        BonusService service = new BonusService();
        int amount = 1000;
        int expected = 0;
        int actual = service.calculateBonus(amount);

        Assert.assertEquals(expected, actual);

    }
}