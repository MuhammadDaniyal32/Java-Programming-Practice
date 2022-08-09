/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_basics_console;

/**
 *
 * @author asp
 */
public class NewClass {
    
    public static void main(String[] args) {
    
    boolean a = true;
    
    if (a == true){
        a = false;
        System.out.println("The boolean value is : " + a);
    
    }
    
    boolean boolvar;
    
    boolvar = (2 < 3);
    
        System.out.println("2 < 3 Answer is : " + boolvar);
        
      boolvar = (4 != 5);
      
        System.out.println("4 == 5 Answer is : " + boolvar);
        
        boolean boolvar1; 
    
        boolvar1 = (2 < 3) && (3 < 4);
        
        System.out.println("(2 < 3) && (3 < 4) Answer is :" + boolvar1);
        
        boolvar1 = (4 == 5) || (2 + 2 == 4);
        
        System.out.println("(4 == 5) || (2 + 2 == 4) Answer is :" + boolvar1);
        
        boolvar1 = (2 + 2 == 3) && (2 < 3 || 5 > 7);
        
        System.out.println("(2 + 2 == 3) && (2 < 3 || 5 > 7) Answer is :" + boolvar1);
        
        
        
    }
    
}
