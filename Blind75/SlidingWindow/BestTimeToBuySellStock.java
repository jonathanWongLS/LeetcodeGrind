package Blind75.SlidingWindow;
import java.lang.Math;

public class BestTimeToBuySellStock {
    public int maxProfit(int[] prices) {
        int buy = prices[0], maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            }
            else {
                maxProfit = Math.max(prices[i] - buy, maxProfit);
            }
        }

        return maxProfit;
    }
}
