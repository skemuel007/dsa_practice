public class Palindrome {
    public static void main(String[] args) {
        // A palindrome is a string that reads the same forward and backward

        // using two pointer comparison
        // convert the string to char array
        String val1 = "radar";
        String val2 = "madam";
        String val3 = "blessing";
        System.out.println(isPalindrome(val1.toCharArray()));
        System.out.println(isPalindrome(val2.toCharArray()));
        System.out.println(isPalindrome2(val2));
        System.out.println(isPalindrome2(val2));
    }

    public static boolean isPalindrome(char[] values) {
        int firstIndex = 0;
        int lastIndex = values.length -1;

        for (firstIndex = 0; firstIndex < lastIndex; firstIndex++) {
            if (values[firstIndex] != values[lastIndex])
                return false;
            lastIndex--;
        }

        return true;
    }

    public static boolean isPalindrome2(String s) {
        int forward = 0;
        int backward = s.length() - 1;

        while(forward < backward) {
            if (s.charAt(forward) != s.charAt(backward)) {
                return false;
            }
            forward++;
            backward--;
        }

        return true;
    }
}
