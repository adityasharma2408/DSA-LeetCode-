class Solution {
    public int longestSubsequence(int[] nums) {
        int n=nums.length;
        int xor=0;
        boolean sub=false;
        for (int num:nums){
            xor^=num;
                if(num!=0){
                    sub=true;
                }
                }
                if(xor!=0){
                    return n;
                }
                else if(sub){
                    return n-1;
                }
                else{return 0;}

    }
}