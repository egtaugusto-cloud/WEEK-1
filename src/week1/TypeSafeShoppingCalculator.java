/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

/**
 *
 * @author 292024
 */
public class TypeSafeShoppingCalculator {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //TYPE-SAFE SHOPPING CALCULATOR
        int Quantity = 5;
        double unitPrice = 110;
        String storeName = "Favor Treats";
        double totalCost = Quantity * unitPrice;
        
        System.out.println ("Store Name: " + storeName);
        System.out.println ("Quanitty: " + Quantity);
        System.out.println ("Unit Price: " + unitPrice);
        System.out.println ("Total:" + totalCost);
        
        //TotalCost is not declared as an int because int doesn't include decimal points and also we declared double for unitPrice
        
        
    }
    
}


