public class Solution {
    public String countAndSay(int n) {
        String result = "1";
        for (int i = 1; i < n; i++) {
            StringBuilder nextSeq = new StringBuilder();
            int count = 1;
            for (int j = 1; j < result.length(); j++) {
                if (result.charAt(j) == result.charAt(j - 1)) {
                    count++;
                } else {
                    nextSeq.append(count).append(result.charAt(j - 1));
                    count = 1;
                }
            }
            nextSeq.append(count).append(result.charAt(result.length() - 1));
            result = nextSeq.toString();
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 5; 
        System.out.println(solution.countAndSay(n)); 
    }
}
