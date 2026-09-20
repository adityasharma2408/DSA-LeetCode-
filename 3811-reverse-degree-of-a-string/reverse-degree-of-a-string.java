class Solution {
    public int reverseDegree(String s) {
        int h=0;
        for (int i=0;i<s.length();i++){
            int a=26-(s.charAt(i)-'a');
            h+=a*(i+1);
        }
        return h;
    }
}