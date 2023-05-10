package RecursionProblems;

public class TowerOfHanoi {
    public static void HanoiTowers(int disks, String pos1, String pos2, String pos3) {
        if (disks == 1) {
            System.out.println("Move top disk from peg: " + pos1 + " to peg: " + pos3);
        } else {
            HanoiTowers(disks - 1, pos1, pos3, pos2);
            HanoiTowers(1, pos1, pos2, pos3);
            HanoiTowers(disks - 1, pos2, pos1, pos3);
        }
    }
}
