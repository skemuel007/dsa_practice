import edu.princeton.cs.algs4.StdArrayIO;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.ArrayList;
import java.util.List;

public class RandomWord {
    public static void main(String[] args) {

        List<String> inputs = new ArrayList<>();
        String input = null;

        while(!(input = StdIn.readString()).equals("\n")) {
            inputs.add(input);
            try {
                if (StdIn.isEmpty()) {
                    break;
                }
            } catch(Exception ex) {

            }
        }

        StdRandom.bernoulli();
    }
}
