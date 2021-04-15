package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {

    @Test
    void summarySales() {

        StatsService summarySales = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = summarySales.summarySales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void averageMonthSales() {
        StatsService averageMonthSales = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = averageMonthSales.averageMonthSales(sales);

        assertEquals(expected, actual);

    }

    @Test
    void monthMaximumSales() {
        StatsService monthMaximumSales = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = monthMaximumSales.monthMaximumSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void monthMinimumSales() {
        StatsService monthMinimumSales = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = monthMinimumSales.monthMaximumSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void monthUnderAverageSales() {
        StatsService monthUnderAverageSales = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = monthUnderAverageSales.monthUnderAverageSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void monthOverAverageSales() {
        StatsService monthOverAverageSales = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = monthOverAverageSales.monthOverAverageSales(sales);

        assertEquals(expected, actual);

    }
}

