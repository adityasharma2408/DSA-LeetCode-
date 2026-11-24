class Solution {
    public List<String> letterCombinations(String digits) {
         List<String> ans = new ArrayList<>();

        if (digits.length() == 0) {
            return ans;
        }

        String[] arr = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
    healper(0,arr,"",digits,ans);
        return ans;
    }
    void healper(int index,String[] arr,String current,String digit,List<String> ans ){
        if(index==digit.length()){
            ans.add(current);
            return;
        }
        int num=digit.charAt(index)-'0';
        String l=arr[num];
        for (int i=0;i<l.length();i++){
            char ch=l.charAt(i);
            healper(index+1,arr,current+ch,digit,ans);
        } 
    }
}