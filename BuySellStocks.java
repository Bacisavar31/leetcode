public class BuySellStocks {
    public static int maxProfit(int[] prices) {
        if (prices.length == 1) {
            return prices[0];
        }

        int max = prices[1] - prices[0];
        int left = 0;
        int right = 1;

        for(int i = 0; i < prices.length - 1; i++) {
            int difference = prices[right] - prices[left];

            if (difference > max) {
                max = difference;
            }

            if (prices[left] > prices[right]) {
                left = right;
            }

            right++;
        }

        if (max < 0) {
            max = 0;
        }

        return max;
    }
}
