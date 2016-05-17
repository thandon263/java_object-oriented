/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SCJAPrograms;

/**
 *
 * @author mthokozisincube
 */
public class PseudoCode_2 {
    
    public static void main (String args[]){
    
        short waterTemperature = 63;
        boolean isStrippersMostActive;
        
       if(waterTemperature <= 69 && (isStrippersMostActive = false)){
       
           System.out.println("Strippers are less active");
       }
       else if(waterTemperature < 69 && waterTemperature > 47 && (isStrippersMostActive = true)){
          
           System.out.println("Strippers are most active");
       }
       else if (waterTemperature <= 47 && (isStrippersMostActive = false)){
       
           System.out.println("Strippers are less active");
           
       }
       
    }
    
}
