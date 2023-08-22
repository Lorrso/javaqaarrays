package ru.netology.qajava.javaqaarrays.services;

public class StatsService {
    public int sumSales(long[] sales) {
        int sumSales = 0; // сумма всех продаж

        for (int i = 0; i < sales.length; i++) {
            sumSales = (int) (sales[i] + sumSales);
        }

        return sumSales;
    }

    public int averageAmount(long[] sales) {
        int averageAmount = sumSales(sales) / sales.length;
        return averageAmount;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int underAverageAmount(long[] sales) {
        int underAverageAmount = 0; // количество месяцев, в которых продажи были ниже среднего
        long averageAmount = averageAmount(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageAmount) {
                underAverageAmount = underAverageAmount + 1;
            }
        }

        return underAverageAmount;
    }

    public int upperAverageAmount(long[] sales) {
        int upperAverageAmount = 0; // количество месяцев, в которых продажи были выше среднего
        long averageAmount = averageAmount(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageAmount) {
                upperAverageAmount = upperAverageAmount + 1;
            }
        }

        return upperAverageAmount;
    }
}
