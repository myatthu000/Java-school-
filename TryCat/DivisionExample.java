package TryCat;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionExample {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();
            System.out.print("Enter denomator: ");
            int denomator = scanner.nextInt();
            int result = numerator / denomator;
            System.out.printf("Result: %d%n", result);
        }catch(ArithmeticException e){
            System.err.println("Exception: Zero denominator invalid.");
        }catch(InputMismatchException e){
            System.err.println("Exception: Integers required.");
        }finally{
            System.out.println("Exception finished.");
        }
    }
}
