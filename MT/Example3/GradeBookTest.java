// package Chapter3;
import java.util.Scanner;

public class GradeBookTest {

    public static void main(String[] args){

        GradeBook myGradeBook = new GradeBook();
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter the course name: ");
        String name = input.nextLine();
        myGradeBook.setCourseName(name);
        System.out.println();

        myGradeBook.displayMessage();

        input.close();
    }
    
}
