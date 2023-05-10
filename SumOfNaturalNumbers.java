public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        System.out.println(sumFormula(4));
        System.out.println(sumIteration(4));
        System.out.println(sumRecursion(4));
    }

    public static int sumIteration(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n;
            n--;
        }

        return sum;
    }

    public static int sumRecursion(int n) {
        if ( n == 0) {
            return n;
        }

        return n + sumRecursion(n - 1);
    }

    public static int sumFormula(int n) {
        int sum = (n * (n + 1)) / 2;
        return sum;
    }
}
