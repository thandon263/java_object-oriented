/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaFundamentals;

/**
 *
 * @author mthokozisincube
 */
public class GradeBook {
    
    private String courseName; //course name for this Grade Book
    
    //constructor initializes courseName with String supplied as argument
    public GradeBook(String name){
    
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
    }
    
    
}// end class GradeBook
