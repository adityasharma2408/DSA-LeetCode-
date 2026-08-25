// By using Sorting
import java.util.*;

class Solution {

    class Pair {
        int val;
        int index;

        Pair(int val, int index) {
            this.val = val;
            this.index = index;
        }
    }

    public int[] twoSum(int[] nums, int target) {

        ArrayList<Pair> a_p = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            a_p.add(new Pair(nums[i], i));
        }

        Collections.sort(a_p, (a, b) -> a.val - b.val);

        int left = 0;
        int right = a_p.size() - 1;

        while (left < right) {

            int sum = a_p.get(left).val + a_p.get(right).val;

            if (sum == target) {
                return new int[] {
                    a_p.get(left).index,
                    a_p.get(right).index
                };
            }

            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[] {};
    }
}