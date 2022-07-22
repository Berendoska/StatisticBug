package ru.netology.statistics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticTestB {

    @Test
    void findMax() {
        StatisticServiceB service = new StatisticServiceB();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void findM() {
        StatisticServiceB service = new StatisticServiceB();
        long[] incomesInBillions = {12, 5, 8, 17, 5, 3, 8, 6, 11, 11, 12};
        long expected = 17;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);



    }

}


