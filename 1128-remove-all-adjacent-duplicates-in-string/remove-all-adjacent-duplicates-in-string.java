class Solution {
    public String removeDuplicates(String s) {
     char [] arr=new char[s.length()];
     int n=0;
     for (int i=0;i<s.length();i++){
            if(n>0&& arr[n-1]==s.charAt(i)){
                n--;
            }
    else{
        arr[n]=s.charAt(i);
        n++;
    }
     }   
     return new String(arr,0,n);
    }
}