package RecursionProblems;

public class Main {
    public static void main(String[] args) {
        TowerOfHanoi.HanoiTowers(3, "A", "B", "C");
        System.out.println(Exercise9_1.sumSquares(3));
        System.out.println(Exercise9_2.power(3, 2));
        Exercise9_2.maximumElement(new int[] {3, 2, 5, 8, 9, 10, 11, 35, 60, 3});
        var res = Exercise9_2.sumFirstNElementArray(new int[] {3, 2, 5, 8, 9, 10, 11, 35, 60, 3}, 4);
        System.out.println(res);

    }
}
