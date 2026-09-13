class Solution {
    public int countVowelSubstrings(String s) {
        int count=0;
        for (int left=0;left<s.length();left++){
            HashSet <Character> set=new HashSet<>();

        for (int right=left;right<s.length();right++){
             char ch=s.charAt(right);
             if(ch!='a' && ch!='e' &&ch!='i' &&ch!='o' &&ch!='u') break;
        
        set.add(ch);
        if(set.size()==5)count++;
        } 
        }
        return count;
    }
}