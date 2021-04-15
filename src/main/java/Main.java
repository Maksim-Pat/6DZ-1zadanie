import ru.netology.statistic.StatsService;

public class Main {
    public static void main(String[] args) {

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService summarySales = new StatsService();
        int sum = summarySales.summarySales(sales);
        System.out.println("Сумма всех продаж: " + sum);

        StatsService averageMonthSales = new StatsService();
        int averageSales = averageMonthSales.averageMonthSales(sales);
        System.out.println("Средняя сумма продаж в месяц: " + averageSales);

        StatsService monthMaximumSales = new StatsService();
        int numberOfMaximumMonth = monthMaximumSales.monthMaximumSales(sales);
        System.out.println("Месяц с максимальными продажами: " + numberOfMaximumMonth);

        StatsService monthMinimumSales = new StatsService();
        int numberOfMinimumMonth = monthMinimumSales.monthMinimumSales(sales);
        System.out.println("Месяц с минимальными продажами: " + numberOfMinimumMonth);

        StatsService monthUnderAverageSales = new StatsService();
        int quantityOfUnderMiddleSales = monthUnderAverageSales.monthUnderAverageSales(sales);
        System.out.println("Количество месяцев с продажами меньше среднего уровня: " + quantityOfUnderMiddleSales);

        StatsService monthOverAverageSales = new StatsService();
        int quantityOfOverMiddleSales = monthOverAverageSales.monthOverAverageSales(sales);
        System.out.println("Количество месяцев с продажами выше среднего уровня: " + quantityOfOverMiddleSales);

    }
}