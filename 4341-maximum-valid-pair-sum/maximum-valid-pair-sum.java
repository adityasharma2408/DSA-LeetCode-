class Solution {
    public int maxValidPairSum(int[] nums, int k) {
         int max=Integer.MIN_VALUE;
        int ans=Integer.MIN_VALUE;
            for (int j=k;j<nums.length;j++){
                max=Math.max(max,nums[j-k]);
                int sum=max+nums[j];
            ans=Math.max(ans,sum);
            }
        
    return ans;
    }
}