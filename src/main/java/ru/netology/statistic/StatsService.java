package ru.netology.statistic;

public class StatsService {

    // Подсчет сумму продаж за год
    public int summarySales (int[] sales){
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    //Подсчет средней суммы продаж в месяц
    public int averageMonthSales (int[] sales){
        int averageSales = 0;
        int period = 0;
        int sum = summarySales(sales);
        for (int sale :sales){
            period = period + 1;
        }
        averageSales = sum / period;
        return averageSales;
    }

    //Месяц с пиком продаж
    public int monthMaximumSales (int[] sales){
        int monthMaximum = sales[0];
        int counter = 0;
        int numberOfMaximumMonth=0;
        for (int sale : sales){
            counter = counter + 1;
            if (monthMaximum <= sale){
                monthMaximum = sale;
                numberOfMaximumMonth = counter;
            }
        }
        return numberOfMaximumMonth;
    }

    //Месяц с минимум продаж
    public int monthMinimumSales (int[] sales){
        int monthMaximum = sales[0];
        int counter = 0;
        int numberOfMinimumMonth=0;
        for (int sale : sales){
            counter = counter + 1;
            if (monthMaximum >= sale){
                monthMaximum = sale;
                numberOfMinimumMonth = counter;
            }
        }
        return numberOfMinimumMonth;
    }

    //Количество месяцев с продажами ниже среднего уровня
    public int monthUnderAverageSales (int[] sales){
        int counter = 0;
        int monthUnderMiddleSales = sales[0];
        int averageSales = averageMonthSales(sales);
        for (int sale : sales){
            monthUnderMiddleSales = sale;
            if (averageSales > monthUnderMiddleSales){
                counter = counter +1;
            }
        }
        return counter;
    }

    //Количество месяцев с продажами выше среднего уровня
    public int monthOverAverageSales (int[] sales){
        int counter = 0;
        int monthOverMiddleSales = sales[0];
        int averageSales = averageMonthSales(sales);
        for (int sale : sales){
            monthOverMiddleSales = sale;
            if (averageSales < monthOverMiddleSales){
                counter = counter +1;
            }
        }
        return counter;
    }
}

