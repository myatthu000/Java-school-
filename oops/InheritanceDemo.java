package oops;

// Inheritance, subclass

class Vehicle {
    protected String brand;
    public Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Vehicle Constructor: " + brand);
    }
}

class Car extends Vehicle {
    private int doors;
    public Car(String brand, int doors) {
        super(brand);
        this.doors = doors;
        System.out.println("Car Constructor with " + doors + " doors");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 4);
    }
}