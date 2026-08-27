class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
       int[] h=new int[nums.length/2];
       for (int i=0;i<nums.length/2;i++){
        h[i]=(nums[i]+nums[nums.length-1-i]);
       }
       Arrays.sort(h);
       return h[h.length-1]; 
    }
}