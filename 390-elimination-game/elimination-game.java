class Solution {
    public int lastRemaining(int n) {
       return  ans(n,1,1,true);
    }
    static int ans(int n,int h,int s,boolean l){
        if(n==1){
            return h;
        }
    if(l|| n%2==1){
        h=h+s;
    }
    return ans(n/2,h,s*2,!l);
    }
}