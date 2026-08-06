package oops;
// Interface -> implements
interface Flyable {
    void fly();

    default void land() {
        System.out.println("Landing gracefully...");
    }
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {
    public void fly() {
        System.out.println("Duck flies in the sky");
    }

    public void swim() {
        System.out.println("Duck swims in the lake");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Duck donald = new Duck();
        donald.fly();
        donald.swim();
        donald.land();
    }
}
