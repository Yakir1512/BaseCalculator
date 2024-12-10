import java.sql.Array;
import java.util.Scanner;


public class SeifHey {
    public static void main(String args[]) {
        String a = "avi";
        // char [] c = a.toCharArray();
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(isequals(s1, s2));
        System.out.println(simetry(s1));
        System.out.println(sort(a));


    }

    public static boolean isequals(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        for (int i = 0; i < s2.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }

        }
        return true;
    }

    public static boolean simetry(String s1) {
        if (s1.charAt(0) != s1.charAt(s1.length() - 1))
            return false;
        for (int i = 1; i > s1.length() - 1; i++) {
            if (s1.charAt(i) != s1.charAt(s1.length() - i))
                return false;
        }
        return true;
    }

    public static String sort(String a) {
        char[] s1 = a.toCharArray();
        char ch;
        for (int i = 0; i <= s1.length; i++) {
            if (s1[i] > s1[i + 1]) {
                ch = s1[i + 1];
                s1[i+1 + 1] =ch;
            }
        }
        return a;
    }
}
