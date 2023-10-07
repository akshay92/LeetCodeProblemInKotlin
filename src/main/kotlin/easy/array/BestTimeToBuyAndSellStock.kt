package easy.array

import kotlin.math.max

class BestTimeToBuyAndSellStock {
    fun maxProfit(prices: IntArray): Int {
        var profit = 0
        var holdShare = prices[0]
        for(i in 1 until  prices.size){
            if(holdShare < prices[i]){
                profit = max(prices[i]-holdShare, profit)
            }
            else{
                holdShare = prices[i]
            }
        }

        return profit
    }
}