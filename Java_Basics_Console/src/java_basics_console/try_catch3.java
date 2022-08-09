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
public class try_catch3 {
    public static void main(String[] args) {
        
        int age;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Age");
        age=input.nextInt();
        
        try
        {
            if(age>18)
            {
                throw new ArithmeticException("Age is not valid");
            }
        }
        
        catch(Exception e)
        {
            System.out.println(e.toString());
            System.out.println("Enter age less than 18!!");
        }
        
    }
}
