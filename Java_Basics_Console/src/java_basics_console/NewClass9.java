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
public class NewClass9 {
  
    
    public static void main(String[] args){
      int count, max, min ,i;
      int[] inputArray = new int [500];
      
      Scanner in = new Scanner(System.in);
      
        System.out.println("Enter Number of elements");
        count = in.nextByte();
        System.out.println("Enter" + count + "elements");
        
        for(i = 0; i < count; i++)
        {
            inputArray[i] = in.nextInt();
        }
      max = min = inputArray[0];
        for(i = 1; i<count; i++)
        {
        if (inputArray[i]>max)
            max = inputArray[i];
       
        }
  }   
}
