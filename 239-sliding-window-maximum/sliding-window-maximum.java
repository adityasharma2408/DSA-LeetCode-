class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int [] ans =new int[nums.length-k+1];
        Deque<Integer> window=new ArrayDeque<>();
        int index=0;
        for (int right=0;right<nums.length;right++){
            while(!window.isEmpty() && window.peekFirst()<=right-k){
                window.pollFirst();
            }
            while(!window.isEmpty()&&nums[window.peekLast()]<=nums[right]){
                window.pollLast();
            }
            window.offerLast(right);
            if(right>=k-1){
                ans[index]=nums[window.peekFirst()];index++;
            }

        }
        return ans;

    }
}