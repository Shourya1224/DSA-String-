public class SubsequenceChecker {

    public static boolean isSubsequence(String sub, String main) {
        if (sub.length() == 0) return true;
        int subIndex = 0, mainIndex = 0;

        while (mainIndex < main.length()) {
            if (sub.charAt(subIndex) == main.charAt(mainIndex)) {
                subIndex++;
                if (subIndex == sub.length()) {
                    return true;
                }
            }
            mainIndex++;
        }

        return false;
    }

    public static void main(String[] args) {
        String sub = "abc";
        String main = "ahbgdc";

        if (isSubsequence(sub, main)) {
            System.out.println("\"" + sub + "\" is a subsequence of \"" + main + "\"");
        } else {
            System.out.println("\"" + sub + "\" is NOT a subsequence of \"" + main + "\"");
        }
    }
}
