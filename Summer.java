import java.io.*;
import java.util.Scanner;

public class student_grade {

   public static void main(String[] args) {

      int grade_1, grade_2, grade_3;
      int student_num = 0;
      int Average;
      Scanner myObj = new Scanner(System.in);
      System.out.println("Enter the first student id ");
      student_num = myObj.nextInt();
      
      while (student_num <= 999) {
         //
         
         System.out.println("student number" + student_num);
         System.out.println("Enter the first percentage grade ");
         grade_1 = myObj.nextInt();
         System.out.println("Enter the second percentage grade ");
         grade_2 = myObj.nextInt();
         System.out.println("Enter the thrid percentage grade ");
         grade_3 = myObj.nextInt();

         if (grade_1 > 100)
            System.out.println("grade can't be more than a hundred");
         if (grade_2 > 100)
            System.out.println("grade can't be more than a hundred");
         if (grade_3 > 100)
            System.out.println("grade can't be more than a hundred");

         Average = (grade_1 + grade_2 + grade_3) / 3;
       System.out.println("student number " + student_num + " average " + Average);
      System.out.println("Enter another student id");
      student_num = myObj.nextInt();
      }
      
      System.out.println("Finish");
   }
}
// What do I put in here to make it stop right away?(some of the calculation is
// not what i want)
// The best way of looking different examples is how others use "while loop"
