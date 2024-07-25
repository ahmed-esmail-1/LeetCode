/*
    121. Best Time to Buy and Sell Stock

    You are given an array prices where prices[i] is the price of a given stock on the ith day.

    You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

    Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 */

//  Question
class Solution {
    public int maxProfit(int[] prices) {
        
    }
}

// Answer
class Solution {
    public int maxProfit(int[] prices) {

       // If there are no prices or only one price, we cannot make any profit
       if (prices.length == 0 || prices.length == 1) {
        return 0;
        }

        // Assume the first price is the minimum price to start with
        int minPrice = prices[0];
        int maxProfit = 0;

        // Loop through all prices starting from the second one
        for (int i = 1; i < prices.length; i++) {
            // If we find a new minimum price, update minPrice
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                // Calculate the profit if we sell at the current price
                int profit = prices[i] - minPrice;
                // Update maxProfit if this profit is greater than the previous maxProfit
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit; // Return the maximum profit we found


    }
}