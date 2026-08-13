class Solution {
    public int maxProfit(int[] prices) {
    int max=0;
    int buy=prices[0];
    for(int i=0;i<prices.length;i++){
        if(prices[i]<buy){
            buy=prices[i];

        }
        int profit=prices[i]-buy;
        if(profit>max){
            max=profit;
        }
    }
    return max;
}
}