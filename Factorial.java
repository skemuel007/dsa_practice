public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorialIteration(5));
        System.out.println(factorialRecursive(5));
    }

    public static int factorialRecursive(int n) {
        if ( n == 0) {
            return 1;
        }

        return n * factorialRecursive(n - 1);
    }

    public static int factorialIteration(int n) {
        int facTotal = 0;
        while( n >= 1) {
            facTotal *= n;
        }

        return facTotal;
    }
}
