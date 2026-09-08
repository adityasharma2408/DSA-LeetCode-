class Solution {
    public int minEatingSpeed(int[] piles, int h) {
         int start=1;
        int end=0;
        int ans=-1;
        for(int n:piles){
            end=Math.max(n,end);
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            long time=0;
            for(int i=0;i<piles.length;i++){
                time+=(piles[i]+mid-1)/mid;
            }
            if(time<=h){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
}