// EvenOdd

import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;

        do{
            System.out.println("Enter Number: ");
            boolean b;

            int num = input.nextInt();
            b = EvenOdd(num);
            if (b==true) {
                System.out.printf("\n%d is Even Number \n", num);
            }else{
                System.out.printf("\n%d is Odd Number \n", num);
            }
        System.out.println("Do Another (y/n)");
        ch=input.next().charAt(0);
        }while(ch!='n');
    }

    public static boolean EvenOdd(int num){
        boolean b;
        if(num%2==0){
            return true;
        }else{
            return false;
        }
    }
}
