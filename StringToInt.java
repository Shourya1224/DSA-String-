public class StringToInt {
    public static int myAtoi(String str) {
        if (str == null || str.isEmpty()) return 0;

        str = str.trim(); 
        if (str.isEmpty()) return 0;

        int sign = 1, i = 0, result = 0;
        if (str.charAt(i) == '-' || str.charAt(i) == '+') {
            sign = (str.charAt(i++) == '-') ? -1 : 1;
        }

        while (i < str.length()) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') break; 
            result = result * 10 + (c - '0');
            i++;
        }

        return result * sign;
    }

    public static void main(String[] args) {
        String str = "   -123abc";
        System.out.println(myAtoi(str)); 
    }
}
