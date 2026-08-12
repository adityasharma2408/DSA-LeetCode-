class Solution {
    public int BS(int nums[],int target,int start,int end){
        int left=start;
        int right=end;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                    return mid;
            }
            else if (nums[mid]  <  target){
                left=mid+1;
            }
            else{right=mid-1;}
        }
        return -1;
    }
    public int mini(int nums[]){
      int l = 0;
    int r = nums.length - 1;

    while (l < r) {
        int m = l + (r - l) / 2;

        if (nums[m] > nums[r]) {
            l = m + 1;
        } else {
            r = m;
        }
    }

    return l;
    }

    public int search(int[] nums, int target) {
        int pivot=mini(nums);
        int ans1=BS(nums,target,0,pivot-1);
    if(ans1==-1){return BS(nums,target,pivot,nums.length-1);}
    return ans1; 
}
}