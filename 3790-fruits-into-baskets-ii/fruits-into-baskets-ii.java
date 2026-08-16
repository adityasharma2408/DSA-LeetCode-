class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int f=fruits.length;
        int b=baskets.length;
        int count=0;
        for (int i=0;i<f;i++){
            boolean placed=false;
            for (int j=0;j<b;j++){
                if(fruits[i]<=baskets[j]){
                   baskets[j]=-1;
                   placed=true;
                   break;
                }
            }
        if(!placed){count++;}
            }
        return count;
    }
}