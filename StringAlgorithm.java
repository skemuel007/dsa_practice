public class StringAlgorithm {
    public static void main(String[] args) {


    }

    public static String reverseString(String str) {
        int strLength = str.length();

        String strValue = "";
        for(int i = strLength - 1; i > 0; i--) {
            strValue += str.charAt(i);
        }

        return strValue;
    }

    public static boolean isPalindrome(String s) {

        int length = s.length() -1;
        int start = 0;
        int stop = length;

        while(start <= stop) {
            if(s.charAt(start) != s.charAt(stop)) {
                return false;
            }
            else {
                start++;
                stop--;
            }
        }

        return true;
    }
}