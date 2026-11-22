class Solution {
    public boolean checkString(String s) {
       boolean h=false;;
       for (int i=0;i<s.length();i++){
        if(s.charAt(i)=='b'){
            h=true;
        }
        if(s.charAt(i)=='a'&& h){
            return false;
        }
       } 
       return true;
    }
}