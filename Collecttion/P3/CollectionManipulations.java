package Collecttion.P3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionManipulations {
    
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for(int i=1;i<=5;i++){
            numbers.add(i);
        }

        System.out.println("Original List: "+numbers);
        Collections.reverse(numbers);
        System.out.println("Reversed List: "+numbers);
        Collections.shuffle(numbers);
        System.out.println("Shuffle List: "+numbers);
    
    }
}
