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
public class CommissionEmployee extends Object {
    
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private double grossSales; //gross weekly sales
    private double commissionRate; // commission percentage
    
    //five argument constructor
    public commissionEmployee (String first, String last, String ssn, double sales, double rate)
    {
        //implicit call to object constructor occurs here
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
        setGrossSales( sales );//validate and store gross sales
        setCommissionRate( rate );//validate and store commission rate
        
    }// end five-argument CommissionEployee constructor
    
    //set first Name
    public void setfirstName( String first )
    {
        firstName = first;
        
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public void setLastName( String last)
    {
        lastName = last;
        
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public void setSocialSecurity( String ssn )
    {
        socialSecurityNumber = ssn;
        
    }
    
    public String getSocialSecurityNumber()
    {
        return socialSecurityNumber;
    }
    
    public void setGrossSales( double sales )
    {
        grossSales = sales;
        
    }
    
    public double getGrossSales()
    {
        return grossSales;
    }
    
    public void setCommissionRate( double rate )
    {
        commissionRate = ( rate > 0.0 && rate < 1.0 ) ? rate : 0.0;
        
    }
    
    public double getCommissionRate()
    {
        return commissionRate;
    }
    
    
    
    
    
 }
