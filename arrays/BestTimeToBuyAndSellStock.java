public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4}; // Example array of stock prices
        int maxProfit = maxProfit(prices);
        System.out.println("Maximum profit: " + maxProfit);
    }

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0; // Not enough data to make a profit
        }

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // Update the minimum price
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice; // Update the maximum profit
            }
        }

        return maxProfit;
    }
}