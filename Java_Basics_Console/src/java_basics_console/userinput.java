/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_basics_console;

import java.util.Scanner;

public class userinput {
    
    
    public static void main(String[] args) {
        
     int a;
     float b;
     String c;
     String d;
     
     Scanner in = new Scanner (System.in);
     
     System.out.println("Enter a String");
     c = in.nextLine();
     d = in.next();
     
        System.out.println("You entered string=" + c);
        System.out.println("Your full name" + d);
        
        System.out.println("Enter an int:");
        a = in.nextInt();
        System.out.println("You entered int" + a);
        
        System.out.println("Enter a float:");
        b = in.nextFloat();
        System.out.println("You enter a float=" + b);
        
    }
}
