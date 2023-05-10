package RecursionProblems;

public class Exercise9_1 {
    public static int sumSquares(int n) {
        if (n == 1) {
            return 1;
        } else {
            return (int)Math.pow(n, 2) + sumSquares(n - 1);
        }
    }
}
