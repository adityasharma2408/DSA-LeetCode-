class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int sum=0;
       int max=Integer.MIN_VALUE;
       int l=0;
       for (int r=0;r<nums.length;r++){
        sum+=nums[r];
        if (r-l+1>k){
            sum-=nums[l];
            l++;
        }
        if(r-l+1==k)max=Math.max(max,sum);
       }
       return (double)max/k;
    }
}