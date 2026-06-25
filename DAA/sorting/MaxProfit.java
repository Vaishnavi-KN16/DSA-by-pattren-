public class MaxProfit {

public static void main(String[] args) {

    int[] price = {7, 1, 5, 3, 6, 4};

    int minPrice = price[0];
    int maxProfit = 0;

    for (int i = 1; i < price.length; i++) {

        if (price[i] < minPrice) {
            minPrice = price[i];
        }

        int profit = price[i] - minPrice;

        if (profit > maxProfit) {
            maxProfit = profit;
        }
    }

    System.out.println("Maximum Profit = " + maxProfit);
}

}
