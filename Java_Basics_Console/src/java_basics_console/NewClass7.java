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
public class NewClass7 {
     public static void main(String[] args) {
       int n1 = 0, n2 = 1, n3,i;
       
         System.out.print(n1+""+n2);
         
         for (i=2;i<10;i++){
             
             n3=n1+n2;
             System.out.print("\n" + n3);   
             n1=n2;
             n2=n3;
         }
     }
}
