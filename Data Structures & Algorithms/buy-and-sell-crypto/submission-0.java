class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int minSoFar=Integer.MAX_VALUE;

        for(int price:prices)
        {
            if(price<minSoFar)
            {
            minSoFar= Math.min(price,minSoFar);
            }
            else
            {
                maxProfit =Math.max(maxProfit,price-minSoFar);
            }
        }
        return maxProfit;
    }
}
