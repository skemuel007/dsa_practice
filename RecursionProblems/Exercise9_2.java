package RecursionProblems;

public class Exercise9_2 {
    public static double power(int base, int exp) {
        if( exp == 0) {
            return 1;
        } else {
            return base * power(base, exp - 1);
        }
    }

    public static int sumFirstN(int n) {
        if ( n == 0) {
            return 0;
        }
        return n + sumFirstN(n - 1);
    }

    public static int sumFirstNElementArray(int[] arr, int n) {
        if (n == 0) {
            return 0;
        }
        return sumFirstNElementArray(arr, n - 1) + arr[n - 1];
    }

    public static int maximumElement(int[] arr) {
        int length = 0;
        int max = 0;
        max = maximumValue(arr, length, max);
        System.out.println(max);
        return max;
    }

    private static int maximumValue(int[] arr, int length, int max) {
        if (length == arr.length - 1) {
            return max;
        }
        if (arr[length] > max) {
            max = arr[length];
        }
        return maximumValue(arr, length + 1, max);

    }

}
