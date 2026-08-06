// CircleArea

import java.util.Scanner;
public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = input.nextDouble();
        double area = Area(radius);
        System.out.printf("Circle Areaf=%.2f \n", area);
    }
    public static double Area(double radius){
        return 3.1415*radius*radius;
    }
}
