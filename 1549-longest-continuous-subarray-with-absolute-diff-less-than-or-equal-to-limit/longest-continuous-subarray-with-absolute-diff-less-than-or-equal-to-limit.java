class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int left=0;
        int maxi=0;
        Deque <Integer> max=new ArrayDeque<>();
        Deque <Integer> min=new ArrayDeque<>();
        for (int right=0;right<nums.length;right++){
            while(!max.isEmpty()&& nums[max.peekLast()]<nums[right]){
                max.removeLast();
            }
            max.addLast(right);
            while(!min.isEmpty()&&nums[min.peekLast()]>nums[right]){
                min.removeLast();
            }
            min.addLast(right);
            while(nums[max.peekFirst()]-nums[min.peekFirst()]>limit){
                    if(max.peekFirst()==left)max.removeFirst();
                    if(min.peekFirst()==left)min.removeFirst();
            left++;
            }
            maxi=Math.max(maxi,right-left+1);
        }
        return maxi;
    }
}