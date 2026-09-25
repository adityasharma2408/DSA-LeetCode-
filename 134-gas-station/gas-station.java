class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int t=0;
        int s=0;
        int ta=0;
        for (int i=0;i<gas.length;i++){
            t+=gas[i]-cost[i];
            ta+=gas[i]-cost[i];
            if(ta<0){
                s=i+1;
                ta=0;
            }
        }
            if(t<0){
                return -1;
            }
        
        return s;
    }
}