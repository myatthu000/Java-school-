package oops;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add(1, "C++");
        list.set(2, "Kotlin");
        String removed = list.remove(0);
        System.out.println("Removed: " + removed);
        System.out.println("List: " + list);
    }
}