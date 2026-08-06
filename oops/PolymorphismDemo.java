package oops;

class Animal {
    public void makeSound() {
        System.out.println("Animal makes a generic sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }

    public void fetch() {
        System.out.println("Dog is fetching ball");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Animal myPet = new Dog();
        myPet.makeSound();
        // myPet.fetch(); 
        ((Dog) myPet).fetch();
    }
}