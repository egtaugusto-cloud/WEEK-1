/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

/**
 *
 * @author 292024
 */
public class OverflowandReferenceInvestigator {
    
      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // OVERFLOW & REFERENCE INVESTIGATOR
    short num = 32767; 
    System.out.println("Before overflow: " + num);
    num++; //increment
    System.out.println("After overflow (32767 + 1): " + num);
    System.out.println("Unexpected result -32768 because short wraps around from 32767 to -32768");
    System.out.println();

    // CREATE 2 STRING
    String stng1 = new String("My String");
    String stng2 = new String("My String");
    String stng3 = "My String"; 

   
    System.out.println("s1 == s2: " + (stng1 == stng2));
    System.out.println("s1.equals(s2): " + stng1.equals(stng2));
    System.out.println();

    System.out.println("s1 == s3: " + (stng1 == stng3));
    System.out.println("s1.equals(s3): " + stng1.equals(stng3));
    System.out.println();

    System.out.println("s2 == s3: " + (stng2 == stng3));
    System.out.println("s2.equals(s3): " + stng2.equals(stng3));
    System.out.println();

    // All == are FALSE because they are different objects in different memory locations, only the text "My String" is the same.
    // .equals() is TRUE because it checks the content, not the location.

    
    int[] arr1 = {1, 2, 3};
    int[] arr2 = arr1; 
    System.out.println("Before modify: arr1[0] = " + arr1[0] + ", arr2[0] = " + arr2[0]);
    arr2[0] = 99; 
    System.out.println("After arr2[0] = 99:");
    System.out.println("arr1[0] = " + arr1[0] + " (changed too!)");
    System.out.println("arr2[0] = " + arr2[0]);
    System.out.println("This proves array reference is shared. both variables point to same array in memory.");
}
}
        
        
    
    

    

