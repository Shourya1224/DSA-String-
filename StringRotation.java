public class StringRotation {
    public static boolean areRotations(String s1, String s2) {
 
        return s1.length() == s2.length() && (s1 + s1).contains(s2);
    }

    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "CDAB";

        if (areRotations(s1, s2)) {
            System.out.println("\"" + s2 + "\" is a rotation of \"" + s1 + "\".");
        } else {
            System.out.println("\"" + s2 + "\" is not a rotation of \"" + s1 + "\".");
        }
    }
}
