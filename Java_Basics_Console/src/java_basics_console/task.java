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
public class task {
   public static void main(String[] args) {
      double a;
      double b;
      int c,d;
      
              
       System.out.println("You Have following choice");
       
       System.out.println("1-Addition");
       
       System.out.println("2-Subtraction");
       
       System.out.println("3-Multiplication");
       
       System.out.println("4-Divison");
       
       Scanner in = new Scanner (System.in);
       c = in.nextInt();
       
              switch (c){
            case 1:
                System.out.println("addition");
                break;
                   case 2:
                System.out.println("substraction");
                break;
            
                   case 3:
                System.out.println("multiplication");
                break;
                   case 4:
                System.out.println("division");
                break;
                   default:
                       System.out.println("invalid choice");
        }
       
       
   } 
}
