class Solution {
    public int countGoodSubstrings(String s) {
        int count=0;
        for (int r=2;r<s.length();r++){
            char a=s.charAt(r-2);
            char b=s.charAt(r-1);
            char c=s.charAt(r);
            if(a!=b && a!=c &&b!=c)count++;
        }
        return count;
    }
}