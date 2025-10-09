import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4};
        String s = "Was it a car or a cat I saw?";
//        String t = "carrace";

        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        int l = 0;
        s = s.replaceAll(" ", "").toLowerCase();

        for (int r = s.length() - 1; r >= s.length() / 2; r--, l++) {
            if (isASCII(s.charAt(r))) --r;
            if (isASCII(s.charAt(l))) ++l;
            if (s.charAt(l) != s.charAt(r)) return false;
        }

        return true;
    }

    public static boolean isASCII(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }
}