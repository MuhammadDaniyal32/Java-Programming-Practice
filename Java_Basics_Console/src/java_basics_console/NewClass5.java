/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_basics_console;
import java.util.Scanner;
/**
 *
 * @author asp
 */
public class NewClass5 {
    public static void main(String[] args) {
        
        int i,j;
        int max;
        
        
        Scanner in = new Scanner (System.in);
        System.out.println("Enter number");
           max = in.nextInt();
         
        
        for (i =0, j = max; i <= max; i++, j--){
            
            System.out.printf("\n%d + %d = %d\n",i,j, i+j);
            
        } 
        
    }
}
