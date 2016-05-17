/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson04;

/**
 *
 * @author mthokozisincube
 */
public class GradeBookTest {
    
    public static void main (String[] args){
        
        GradeBook4 myGradeBook = new GradeBook4(
                "CS101 Introduction to Java Programming");
        myGradeBook.displayMessage();
        myGradeBook.inputGrades();
        myGradeBook.displayGradeReport();
    
    }
    
}
