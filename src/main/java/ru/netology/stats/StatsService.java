package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long allSales = 0;
        for (long sale : sales) {
            allSales = allSales + sale;
        }
        return allSales;
    }


    public long average(long[] sales) {
        long allSales = sum(sales);
        long averageSale = allSales / sales.length;
        return averageSale;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }


    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }


public int belowTheAverage(long[] sales){
        int belowMonth = 0;
    for (long sale : sales) {
        if (sale < average(sales)) {
            belowMonth = belowMonth + 1;
        }
    }
    return belowMonth;
}


    public int aboveAverage(long[] sales){
        int aboveMonth = 0;
        for (long sale : sales) {
            if (sale < average(sales)) {
                aboveMonth = aboveMonth + 1;
            }
        }
        return aboveMonth;
    }


}

