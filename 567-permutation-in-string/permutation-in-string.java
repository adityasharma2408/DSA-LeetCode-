class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int left=0;
        int k=s1.length();
        int[] ch_1=new int[26];
        int[] ch_2=new int[26];

        for (char ch:s1.toCharArray()){
            ch_1[ch-'a']++;
        }
        for (int r=0;r<s2.length();r++){
            char a=s2.charAt(r);
            ch_2[a-'a']++;
        if(r-left+1==k){
                if(Arrays.equals(ch_1,ch_2)){
                    return true;
                }
                 char ch_r=s2.charAt(left);
        ch_2[ch_r-'a']--;
        left++;
        }

        }
        return false;
    }
}