import java.util.LinkedHashSet;
import java.util.Set;

public class  removeDuplicate{
    public static String removeDuplicates(String str) {
        Set<Character> seen = new LinkedHashSet<>();
        for (char c : str.toCharArray()) {
            seen.add(c);
        }
        StringBuilder result = new StringBuilder();
        for (char c : seen) {
            result.append(c);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "geeksforgeeks";
        String output = removeDuplicates(input);
        System.out.println("Original: " + input);
        System.out.println("Without duplicates: " + output);
    }
}
