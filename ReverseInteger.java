public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(12345));
    }

    public static int reverse(int n) {
        int remainder;
        String newValue = "";
        // base case
        while (n > 10) {
            remainder = n % 10;
            n = n / 10;

            newValue += Integer.toString(remainder);
        }

        newValue += Integer.toString(n);
        int newInt = Integer.parseInt(newValue);
        return newInt;
    }

    public static int reverse2(int n) {
        int reversed = 0;
        int remainder = 0;

        boolean isNegative = false;

        while (n > 0) {
            remainder = n % 10;
            n = n / 10;
            reversed = reversed * 10 + remainder;
        }

        return reversed;
    }
}
