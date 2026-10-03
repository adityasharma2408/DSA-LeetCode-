class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        for (int baby:candies){
            max=Math.max(max,baby);
        }
        List<Boolean> love =new ArrayList<>();
        for (int h:candies){
            love.add(h +extraCandies >=max);
        }
        return love;
    }
}