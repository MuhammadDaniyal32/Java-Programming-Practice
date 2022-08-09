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
public class try_catch {
  public static void main(String[] args) {
    try{
        int a = 20,b = 0;
        
        int result = a/b;
        System.out.println(result);
    }  
      catch(ArithmeticException e){
          System.out.println("Error"+e.getMessage());
      
//          System.out.println(e);
          System.out.println("Rest of the code");
          
         for(int i=0;i<5;i++)
         {
             System.out.println("code is running");
         }
      }
  }  
}
