// package Chapter3;

public class GradeBookTest {

    public static void main(String[] args){

        // GradeBook gradeBook1 = new GradeBook();
        GradeBook gradeBook1 = new GradeBook("Introduction of Java Programming.");
        // gradeBook1.setCourseName("Introduction of Java Programming.");


        // GradeBook gradeBook2 = new GradeBook();
        GradeBook gradeBook2 = new GradeBook("Introduction of Computer Science.");
        // gradeBook2.setCourseName("Introduction of Computer Science.");

        
        System.out.println(gradeBook1.getCourseName());
        System.out.println(gradeBook2.getCourseName());
        // gradeBook1.displayMessage();
        // gradeBook2.displayMessage();
       
    }
    
}
