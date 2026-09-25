class Solution {
    public int characterReplacement(String s, int k) {
        int freq [] =new int[26];
        int l=0;
        int max=0;
        int ans=0;
        for (int r=0;r<s.length();r++){
            int index=s.charAt(r)-'A';
            freq[index]++;
            max=Math.max(max,freq[index]);
            while(r-l+1-max>k){
                freq[s.charAt(l)-'A']--;
                l++;
            }
    ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}