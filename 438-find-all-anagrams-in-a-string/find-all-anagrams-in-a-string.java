class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res=new ArrayList<>();
        int [] p_table=new int[26];
        int[]  s_table=new int[26];
        int left=0;
        int right=0;
        int k=p.length();



        for (char ch:p.toCharArray()){
            p_table[ch-'a']++;
        }
        for (int r=0;r<s.length();r++){
            char ch_l=s.charAt(r);
            s_table[ch_l-'a']++;
            if(right-left+1==k){
    if(Arrays.equals(p_table,s_table)){
        res.add(left);
    }
        char ch_r=s.charAt(left);
        s_table[ch_r-'a']--;
        left++;
        }
        right++;
        }
        return res;
    }
}