package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }


    public int monthMaximumSale(long[] sales) {
        int montMaximum = 0;
        long saleMaximum = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= saleMaximum) {
                montMaximum = i;
                saleMaximum = sales[i];
            }


        }
        return montMaximum + 1;
    }

    public int monthMinimumSale(long[] sales) {
        int montMinimum = 0;
        long saleMinimum = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= saleMinimum) {
                montMinimum = i;
                saleMinimum = sales[i];
            }


        }
        return montMinimum + 1;
    }

    public int monthsSaleBelowAverage(long[] sales) {
        long average = average(sales);
        int result = 0;
        for (long sale : sales) {
            if (sale < average(sales)) {
                result++;
            }


        }
        return result;
    }

    public int monthsSaleOverAverage(long[] sales) {
        long average = average(sales);
        int result = 0;
        for (long sale : sales) {
            if (sale > average(sales)) {
                result++;
            }


        }
        return result;
    }

}
