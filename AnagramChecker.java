import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        char[] s1 = {'r', 'e', 's', 't', 'f', 'u', 'l'};
        char[] s2 = {'f', 'l', 'u', 's', 't', 'e', 'r'};
        System.out.println(solve(s1, s2));
    }

    private static boolean solve(char[] s1, char[] s2) {
        if (s1.length != s2.length) {
            return false;
        }
        // sort the values
        Arrays.sort(s1); // original word is subject, other words formed
        Arrays.sort(s2);
        // convert char to string
        String val1 = new String(s1);
        String val2 = new String(s2);
        // compare the string values
        // return boolean of match
        return val1.equalsIgnoreCase(val2);

        // we can iterate through and compare the values
    }
}
