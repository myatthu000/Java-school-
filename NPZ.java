import java.util.Scanner;

public class NPZ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        int zero = 0;

        System.out.print("Enter 5 numbers: ");
        
        for(int i=0;i<5;i++){
            int numbers = input.nextInt();
            
            if(numbers > 0){
                positive++;
            }else if(numbers <0){
                negative++;
            }else{
                zero++;
            }
        }

        System.out.println("Positive numbers: "+ positive);
        System.out.println("Negative numbers: "+ negative);
        System.out.println("Zeros: "+ zero);

        input.close();

    }
}
