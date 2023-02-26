package Blind75.SlidingWindow;

public class Main {
    public static void main(String[] args) {
        BestTimeToBuySellStock solution1 = new BestTimeToBuySellStock();
        
        int[] ar1 = {7,1,5,3,6,4};
        System.out.println("Best Time to Buy and Sell Stock: " + Integer.toString(solution1.maxProfit(ar1)));

    }

}
