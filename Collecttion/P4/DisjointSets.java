package Collecttion.P4;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DisjointSets {
    
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("Java");
        set1.add("Python");
        
        Set<String> set2 = new HashSet<>();
        set2.add("C++");
        set2.add("JavaScript");

        boolean noCommonElements = Collections.disjoint(set1, set2);

        if (noCommonElements) {
            System.out.println("The sets have no elements in common.");
        }else{
            System.out.println("The sets share common elements.");
        }

    }
}
