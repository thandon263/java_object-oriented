/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson03;

/**
 *
 * @author mthokozisincube
 */
import java.util.Scanner;

public class GradeBook3 {
    
    private String courseName; //course name for this Grade Book
    
    //constructor initializes courseName with String supplied as argument
    public GradeBook3(String name){
    
        courseName = name;
    }// end constructor
    
    
    
    //method to set the course name
    public void setCourseName(String name){
            
        courseName = name; //store the course name

    }//end method displayMessage
    
    //method to retrieve the course name
    public String getCourseName(){
    
        return courseName;
    }//end method getCourseName
    
    //display a welcome message to the GradeBook user
    public void displayMessage(){
    
        //this statement calls getCourseName to get the
        //name of the course this GradeBook represents
        System.out.printf("Welcome to the grade book for\n%s!\n", getCourseName() );
    }//end method displayMessage
    
    
    //Determine class average based on 10 grades entered by user
    public void determineClassAverage(){
    
        //create Scanner to obtain input from command window
        Scanner input = new Scanner(System.in);
        
        int total; //sum of grades entered by user
        int gradeCounter; //number of the grade to be entered next
        int grade; // grade value entered by user
        double average; //number with decimal point for average of grades
        
        //initialization phase
        total = 0; //initialize total
        gradeCounter = 0; //initialize loop counter
        
        //processing phase
        //prompt for input and read grade from user
        System.out.print("Enter grade or -1 to quit: ");
        grade = input.nextInt();
        
        //loops until sentinel value read from user
        while (gradeCounter != -1)
        {
        
            System.out.println("Enter grade or -1 to quit: "); //prompt
            grade = input.nextInt();//input next grade
            total = total + grade;//add grade to total
            gradeCounter = gradeCounter + 1; //increment counter by 1
        }//end while 
        
        
        //Termination phase
        //if user entered at least one grade...
        if( gradeCounter != 0 ){
        
            //calculate average of all grades entered
            average = (double) total / gradeCounter;
            
            //display total & average (with two digits of precision)
            System.out.printf("\nTotal of the %d grades entered is %d\n", gradeCounter, total);
            System.out.printf("Class average is %.2f\n", average);
        
        }//end if
        
        else //no grades were entered, so output appropriate message
            System.out.println("No grades were entered");
    }//end of method determinClassAverage
    
    
}// end class GradeBook
