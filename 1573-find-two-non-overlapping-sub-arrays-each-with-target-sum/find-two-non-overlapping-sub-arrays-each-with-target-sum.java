class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        HashMap <Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int n=arr.length;
        int INF=Integer.MAX_VALUE;
        int [] best=new int[n];
        for(int i=0;i<n;i++){best[i]=INF;}
        int sum=0;
        int answer=INF;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(i>0){
                best[i]=best[i-1];
            }
            if(map.containsKey(sum-target)){
                int left=map.get(sum-target);
                int len=i-left;
                if(left>=0 && best[left]!=INF){
                    answer=Math.min(answer,best[left]+len);
                }
                best[i]=Math.min(best[i],len);
            }
            map.put(sum,i);
        }
        return answer==INF?-1:answer;
    }
}