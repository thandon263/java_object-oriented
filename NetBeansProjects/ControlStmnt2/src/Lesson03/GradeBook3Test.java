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
public class GradeBook3Test {
    
    public static void main(String []args){
    
        //create GradeBook object myGradeBook and
        //pass course name to constructor
        GradeBook3 myGradeBook = new GradeBook3("CS101 Introduction to Java Programming");
        
        myGradeBook.displayMessage();//display welcome message
        myGradeBook.determineClassAverage();//find average of 10 grades
    
    }//end main method
}//end class GradeBook3Test
