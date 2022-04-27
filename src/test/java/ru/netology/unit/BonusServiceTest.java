package ru.netology.unit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BonusServiceTest {

    @Test
    public void calculateBonusAmount2000() {
        BonusService service = new BonusService();
        int amount = 2000;
        int expected = 10;
        int actual = service.calculateBonus(amount);

        assertEquals(expected, actual);

    }

    @Test
    public void calculateBonusAmount1000() {
        BonusService service = new BonusService();
        int amount = 1000;
        int expected = 0;
        int actual = service.calculateBonus(amount);

        assertEquals(expected, actual);

    }
}