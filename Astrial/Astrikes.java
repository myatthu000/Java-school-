package Astrial;

import java.util.Scanner;

// HollowSquare

public class Astrikes {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        
        while (true) {
            System.out.print("Enter numbers between 1-20: ");
            size = input.nextInt();

            if(size>0 && size<=20){
                for(int row=1;row<=size;row++){
                    for(int col=1;col<=size;col++){

                        if(row==1 || row==size || col==1 || col==size){
                            System.out.print("*");
                        }else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println("");
                }
                // break;
            }else{
                System.out.println("Error: size must be between 1-20. Try again.");
            }
        }
            // for(int row=1;row<=size;row++){
            //     for(int col=1;col<=size;col++){

            //         if(row==1 || row==size || col==1 || col==size){
            //             System.out.print("*");
            //         }else{
            //             System.out.print(" ");
            //         }
            //     }
            //     System.out.println("");
            // }
        // input.close();

    }
}
