package Collecttion.P2;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SortedUniqueWords {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();

        String[] words = text.toLowerCase().split("\\s+");
        Set<String> sortedSet = new TreeSet<>();
        
        for(String word: words){
            sortedSet.add(word);

        }
        System.out.println("Unique words in alphabetical order: "+ sortedSet);
        scanner.close();
    }
}
