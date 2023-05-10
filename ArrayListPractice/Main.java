package ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(30);
        System.out.println(numbers);

        ArrayList<Integer> number2 = new ArrayList<>(Arrays.asList(2, 3));
        System.out.println(number2);

        number2.add(1);
        number2.add(3);
        number2.add(4);

        System.out.println(number2.get(2));

        for(int i = 0; i < number2.size(); i++) {
            System.out.println(number2.get(i));
        }

        Iterator<Integer> iterator = number2.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        int index = number2.indexOf(3);
        System.out.println(index);

        number2.remove(2);
    }
}
