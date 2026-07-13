public class BestTimeToBuyAndSellStockII{
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4}; // Example array of stock prices
        int maxProfit = maxProfit(prices);
        System.out.println("Maximum profit: " + maxProfit);
    }

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0; // Not enough data to make a profit
        }

        int totalProfit = 0;    
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                totalProfit += prices[i] - prices[i - 1]; // Accumulate profit for each upward trend
            }
        }
        return totalProfit;
    }
}