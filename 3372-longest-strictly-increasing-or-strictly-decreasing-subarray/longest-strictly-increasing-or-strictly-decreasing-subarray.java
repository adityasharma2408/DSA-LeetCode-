class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int in=1;
        int d=1;
        int b=1;
        int max=1;
        for (int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                d++;
                in=1;
            }
            else if (nums[i]>nums[i-1]){
                in++;
                d=1;
            }
            else {
                in=1;
                d=1;
            }
            max=Math.max(max,Math.max(in,d));
        }
        return max;
    }
}