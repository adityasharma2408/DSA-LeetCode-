class Solution {
    public boolean checkDivisibility(int n) {
        int a=n;
        int sum=0;
        int p=1;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            p*=rem;
            n/=10;
        }
        int h=sum+p;
        if(a%h==0){
            return true;
        }
        else {return false;}
    }
}