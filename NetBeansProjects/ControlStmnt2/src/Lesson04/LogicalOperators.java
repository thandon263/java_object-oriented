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
public class LogicalOperators {
    
    public static void main(String args[]){
            
        System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n", 
                "Conditional AND (&&)", "false && false", (false && false),
        "false && true", (false && true),
        "true && false", (true && false),
        "true && true", (true && true));
        
            System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n", 
                "Conditional OR (||)", "false || false", (false || false),
        "false && true", (false || true),
        "true && false", (true || false),
        "true && true", (true || true));
        
            System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n", 
                "Boolean logical AND (&)", "false & false", (false & false),
        "false && true", (false & true),
        "true && false", (true & false),
        "true && true", (true & true));    
            
            
            System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n", 
                "Boolean inclusive OR (|)", 
        "false | false", (false | false),
        "false | true", (false | true),
        "true | false", (true | false),
        "true | true", (true | true));

            System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n", 
                "Boolean exclusive OR (^)", 
        "false ^ false", (false ^ false),
        "false ^ true", (false ^ true),
        "true ^ false", (true ^ false),
        "true ^ true", (true ^ true));    
        
            
            System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n", 
                "Logical NOT (!)",
                "!false", (!false), "!true", (!true) );
    }
}
