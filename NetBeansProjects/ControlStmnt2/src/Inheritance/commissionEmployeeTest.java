/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author ncubethando20
 */
public class commissionEmployeeTest {
    
    public static void main(String []args){
    //instantiate Commission Employee object
    CommissionEmployee employee = new CommissionEmployee(
            "Sue", "Jones", "222-22-2222", 10000, .06);
    
    //get commission employee object
    System.out.println("Employee information obtained by get methods: \n" );
    System.out.printf( "%s %s\n", "First name is", employee.getFirstName());
    System.out.printf( "%s %s\n", "last name is", employee.getLastName());
    System.out.printf( "%s %s\n", "Social security number is", employee.getSocialSecurityNumber());
    System.out.printf( "%s %s\n", "Gross sales is", employee.getGrossSales());
    System.out.printf( "%s %s\n", "Commission rate is", employee.getCommissionRate());
    
    employee.setGrossSales(500);//set gross sales
    employee.setCommissionRate(.1);//set commission rate
    
    System.out.printf( "\n%s: \n\n%s\n", "Update employee information obtained by toString", employee);
    
    }//end main method
    
}//end class CommissionEmployeeTest
