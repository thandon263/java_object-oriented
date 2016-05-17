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
public class Account {
    
    private double balance; // instance variable that stores the balance
    
    //constructor
    public Account(double initialBalance){
    
        //validate that initialBalance is greater than 0.0;
        //if it is not, balance is initialized to the default value 0.0
        if(initialBalance > 0.0)
            balance = initialBalance;
        
        }//end constructor
   
    //credit (add) an amount to the account
    public void credit(double amount){
    
        balance = balance + amount; // add amount to balance
    
    }//end method credit
    
    //return the account balance
    public double getBalance(){
    
        return balance; //gives the value of the balance to the calling method
        
    }//end method getBalance
    
    
}//end class Account
