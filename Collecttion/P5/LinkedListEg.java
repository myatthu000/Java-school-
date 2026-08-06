package Collecttion.P5;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class LinkedListEg {
    
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Random rand = new Random();

        for(int i=0;i<25;i++){
            list.add(rand.nextInt(101));
        }

        Collections.sort(list);
        int sum = 0;
        for(int num:list){
            sum += num;
        }

        double average = sum / 25.0;

        

        System.out.println("Sorted List: "+ list);
        System.out.println("Sum: "+ sum);
        System.out.println("Average: "+ average);

    }
}
