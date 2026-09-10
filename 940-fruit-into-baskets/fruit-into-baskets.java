class Solution {
    public int totalFruit(int[] fruits) {
        int l=0,max=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int r=0;r<fruits.length;r++){
                int key=fruits[r];
        map.put(key,map.getOrDefault(key,0)+1);
                while(map.size()>2){
            int key_l=fruits[l];
            map.put(key_l,map.get(key_l)-1);
           if(map.get(key_l)==0){
            map.remove(key_l);
           }
            l++;
            }
        max=Math.max(max,r-l+1);

       }
        return max;
    }
}