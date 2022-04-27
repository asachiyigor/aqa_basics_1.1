package ru.netology.unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTestJup {

    @Test
    void calculateBonusAmount2000JunitJup() {
        BonusService service = new BonusService();
        int amount = 2000;
        int expected = 10;
        int actual = service.calculateBonus(amount);

        assertEquals(expected, actual);

    }

    @Test
    void calculateBonusAmount1000JunitJup() {
        BonusService service = new BonusService();
        int amount = 1000;
        int expected = 0;
        int actual = service.calculateBonus(amount);

        assertEquals(expected, actual);

    }
}