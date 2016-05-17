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
public class Interest {
    
    public static void main(String[] args){
       
        double amount, principal, rate; //declare principal, amount, rate
        principal = 1000.0;
        rate = 0.05;
        
        //display headers
        System.out.printf("%s%20s\n", "Year", "Amount on deposit");
        
        //calculate new amount for specified year
        for(int year = 1; year <= 10; year++){
        amount = principal * Math.pow(1.0 + rate, year);
        
        //display the year and amount
        System.out.printf("%4d%,20.2f\n", year, amount );
        
        }//end for
        
    }//end main
                
    
    
}//end class Interest
