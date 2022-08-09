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
public class NewClass1 {
  public static void main(String[] args) {
      
      int first = 400, second = 700, result;
      result = first + second;
      
      if (result > 1000){
          
          second = second + 100;
          
      } 
      
      System.out.println("The value of second is " + second);
  }  
}
