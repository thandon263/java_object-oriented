/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaFundamentals;

import java.util.Scanner; //program uses Scanner
/**
 *
 * @author mthokozisincube
 */
public class GradeBookTest {
    
    //main method begins program execution
    public static void main(String args[]){
        //create Scanner object to obtain input from command winndow
 
        Scanner input = new Scanner(System.in);
        

        //create a GradeBook object and assign it to myGradeBook
        GradeBook gradeBook1 = new GradeBook("CS101 Introduction to Java");
        GradeBook gradeBook2 = new GradeBook("CS102 Data structures in Java");
        
        //display initial value of courseName
        System.out.printf("gradebook1 course name is: %s\n\n", gradeBook1.getCourseName() );
        
      //display initial value of courseName for each GradeBook
      System.out.printf("gradebook2 course name is: %s\n", gradeBook2.getCourseName() );
        //call myGradeBook's displayMessage method
        //and pass nameOfCourse as an argument
       
    }// end main
 
    
}//end Class GradeBook test
