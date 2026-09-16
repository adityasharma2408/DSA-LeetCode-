class Solution {
    public int divisorSubstrings(int num, int k) {
         String s = String.valueOf(num);
        int count = 0;

        for (int left = 0; left + k <= s.length(); left++) {

            String temp = s.substring(left, left + k);
            int value = Integer.parseInt(temp);

            if (value != 0 && num % value == 0) {
                count++;
            }
        }

        return count;
    }
}