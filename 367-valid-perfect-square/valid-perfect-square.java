class Solution {
    public boolean isPerfectSquare(int num) {
        long l=0;
        long r=num;
        while(l<=r){
            long mid=l+(r-l)/2;
            long square=mid*mid;
            if(square==num){
                return true;
            }
            else if (square<num){
                l=mid+1;
            }
            else{r=mid-1;}
        }
        return false;
    }
}