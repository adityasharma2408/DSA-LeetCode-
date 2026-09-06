class Solution {
  HashMap<String, Integer> map = new HashMap<>();

    public int numDistinct(String s, String t) {
        return helper(s, t, 0, 0);
    }

    public int helper(String s, String t, int i, int j) {

        if (j == t.length()) {
            return 1;
        }

        if (i == s.length()) {
            return 0;
        }

        String key = i + "," + j;

        if (map.containsKey(key)) {
            return map.get(key);
        }
        int count;
        if (s.charAt(i) == t.charAt(j)) {
            count = helper(s, t, i + 1, j + 1)
                  + helper(s, t, i + 1, j);
        } else {
            count = helper(s, t, i + 1, j);
        }

        map.put(key, count);
        return count;
    }
}