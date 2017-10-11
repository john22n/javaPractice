package PraticeQuestions;

/**
 * Created by JohnNoriega22 on 10/8/17.
 */
public class Array {

    public static int getMaxProfit(int[] stockPricesYesturday) {
        if (stockPricesYesturday.length < 2) {
            throw new IllegalArgumentException("requires at least 2 prices");

        }

        int minPrice = stockPricesYesturday[0];
        int maxProfit = stockPricesYesturday[1] - stockPricesYesturday[0];

        for (int i = 1; i < stockPricesYesturday.length; i++) {
            int currentPrice = stockPricesYesturday[i];
            int potentialProfit = currentPrice - minPrice;

            maxProfit = Math.max(maxProfit, potentialProfit);
            minPrice = Math.min(minPrice, currentPrice);
        }
        return maxProfit;
    }
}
