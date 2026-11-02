class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid=nums.length/2;
        int h=0;
        for(int i=0;i<nums.length;i++){
            h+=Math.abs(nums[i]-nums[mid]);
        }
        return h;
    }
}