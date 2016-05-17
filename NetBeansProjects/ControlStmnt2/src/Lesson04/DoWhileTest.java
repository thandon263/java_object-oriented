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
public class DoWhileTest {
    
    public static void main(String[] args){
        
        int counter = 12; //initialize counter
        
        do{
            System.out.printf( "%d\n\n ", counter);
            counter++;
        }while (counter >= 12 && counter <= 37); 
        
        
    }
    
}
