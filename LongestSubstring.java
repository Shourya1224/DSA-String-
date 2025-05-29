import java.util.HashMap;

public class LongestSubstring {
    public static String longestUniqueSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        int left = 0, maxLength = 0, start = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= left) {
                left = charIndexMap.get(currentChar) + 1; 
            }

            charIndexMap.put(currentChar, right); 

          
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                start = left;
            }
        }

        return s.substring(start, start + maxLength);
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        String result = longestUniqueSubstring(input);
        System.out.println("Longest substring without repeating characters: " + result);
    }
}
