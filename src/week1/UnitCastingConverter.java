/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

/**
 *
 * @author 292024
 */
public class UnitCastingConverter {
    
 /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //UNIT CASTING CONVERTER
        //computing and printing the equivalent Whole meters, plus the remaining centimeters.
        
       double centimeters = 255.5;
       int wholeMeter = (int) centimeters / 100;
       double remainingCentimeter = centimeters % 100 ;
       
       System.out.println ("Total Centimeter: " + centimeters + "cm");
       System.out.println ("Whole Meter: " + wholeMeter + "m");
       System.out.println ("Remaining Cenimeter: " + remainingCentimeter + "cm");
       
       
     
       
       
            
        
    }
    
}
