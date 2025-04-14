package medium;

public class Problem15 {
    public int maxProfit1(int[] prices) {
        int min = prices[0];
        int maxProfit = 0;
        int total = 0;
        for (int i = 1; i < prices.length; i++){
            if (prices[i] < min) {
                min = prices[i];
            } else {
                    maxProfit = prices[i] - min;
                    total = total + maxProfit;
                    min = prices[i];
            }
        }
        return total;
    }
}
