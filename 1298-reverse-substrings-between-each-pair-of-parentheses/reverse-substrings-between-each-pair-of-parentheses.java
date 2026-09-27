class Solution {
    public String reverseParentheses(String s) {
        char[] arr = s.toCharArray();
        int[] open = new int[s.length()];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                open[count] = i;
                count++;
            }
            else if (arr[i] == ')') {
                int start = open[count - 1];
                count--;
                int left = start + 1;
                int right = i - 1;
                while (left < right) {
                    char temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }
            }
        }
        String ans = "";
        for (char ch : arr) {
            if (ch != '(' && ch != ')') {
                ans += ch;
            }
        }
        return ans;
    }
}