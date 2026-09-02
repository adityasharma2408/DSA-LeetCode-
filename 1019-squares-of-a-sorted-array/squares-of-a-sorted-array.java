class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] h=new int[nums.length];
        for (int i=0;i<nums.length;i++){
            h[i]=nums[i]*nums[i];
        }
        Arrays.sort(h);
        return h;
    }
}