class Solution {
    public int sumOfSquares(int[] nums) {
    int n=nums.length;
    int sum=0;
    int l=1;
    int r=n;
    while(l<=r){
        if(n%l==0){
            sum+=nums[l-1]* nums[l-1];
        }
        if(l!=r&&n%r==0){
            sum+=nums[r-1]*nums[r-1];
        }
        l++;
        r--;
    }
    return sum;
    }
}