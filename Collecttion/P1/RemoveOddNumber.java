package Collecttion.P1;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveOddNumber {
    
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(22);
        numbers.add(33);
        numbers.add(40);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 != 0) {
                iterator.remove();
            }
        }
        System.out.println("Even numbers remaining: "+numbers);

    }
}
