class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long common=Math.min(need1,need2);
        long minr1=common*Math.min(costBoth,cost1+cost2);
         minr1+=(need1-common)*Math.min(costBoth,cost1);
         minr1+=(need2-common)*Math.min(costBoth,cost2);
        return minr1;
    }
}