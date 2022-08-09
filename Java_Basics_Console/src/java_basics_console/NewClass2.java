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
public class NewClass2 {
    
    public static void main(String[] args) {
        int number  = 10 , remainder;
        
        remainder = number % 2;
        
        if (remainder == 0){
            System.out.println("Number is even");
        }
        
        else{
            System.out.println("Number is odd");
        } 
           
    }
    
}
