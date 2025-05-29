import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String str : strs) {
     
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);


            anagramMap.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(str);
        }

      
        return new ArrayList<>(anagramMap.values());
    }

    public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(input);
        System.out.println(result);
    }
}
