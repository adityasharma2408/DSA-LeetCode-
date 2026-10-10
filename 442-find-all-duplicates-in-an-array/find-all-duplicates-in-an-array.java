class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap <Integer,Integer> map=new HashMap<>();
        List <Integer> list=new ArrayList<>();

        for (int r=0;r<nums.length;r++){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
        }
        for (int key:map.keySet()){
            if(map.get(key)>1){
                list.add(key);
            }
        }
        return list;
    }
}