/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Task;

import java.util.Scanner;

/**
 *
 * @author dani
 */
public class Task1 {

   
    public static void main(String[] args)  {
        char ch;
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a Alphabet==>");
        ch = in.next().charAt(0);
      
        if (ch >= 'A' && ch <= 'Z')
        {
            System.out.println("\n(" +ch+ ") This upper case Alphabet");
    }
        else if (ch >= 'a' && ch <= 'z')
        {
            System.out.println("\n(" +ch+ ") This is lower case Alphabet");
        }
        
        else 
        {
            System.out.println("\n(" +ch+ ") This is not a Alphabet");
        }
      }
}

