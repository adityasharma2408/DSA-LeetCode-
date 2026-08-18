class Solution {
    public boolean judgeSquareSum(int c) {
        long l=0;
        long r=(long)Math.sqrt(c);
        while(l<=r){
            long ans=l*l+r*r;
            if(ans==c){
                return true;
            }
            else if(ans<c){
                l++;
            }
        else{
            r--;
        }
        }
        return false;
    }
}