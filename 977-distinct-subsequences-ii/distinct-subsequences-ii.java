class Solution {
    public int distinctSubseqII(String s) {
        long [] last=new long[26];
        long total=0;
        int MOD=1000000007;
        for (char ch:s.toCharArray()){
            int index=ch-'a';
            long newcount=(total+1)%MOD;
            total=(total+newcount-last[index]+MOD)%MOD;
            last[index]=newcount;
        }
        return (int) total;
    }
}