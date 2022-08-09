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
public class NewClass4 {
    public static void main(String[] args) {
           int choice;
         
           Scanner in = new Scanner (System.in);
           
           System.out.println("Enter number");
           choice = in.nextInt();
           System.out.println("You entered a number" + choice);
           
        switch (choice){
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

       
