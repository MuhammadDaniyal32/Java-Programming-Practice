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

public class NewClass3 {
 public static void main(String[] args) {
     
     Scanner in = new Scanner (System.in);
     
     int totalmarks;
     
     System.out.println("Enter a total marks");
     
     totalmarks = in.nextInt();
     
     
     if (totalmarks >= 90){
         System.out.println("Your Grade is 'A+'");
     }
      
     else if (totalmarks >= 60){
     
       System.out.println("Your Grade is 'A'");
 }
     
     else if (totalmarks >= 40){
     
       System.out.println("Your Grade is 'B'");
 }
     else if (totalmarks >= 30){
     
       System.out.println("Your Grade is 'C'");
 }
     else{ 
         System.out.println("Your Failed!!!!!");
 }   
}
}