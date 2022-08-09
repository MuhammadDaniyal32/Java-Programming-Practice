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
public class Error_in_Array {
  public static void main(String[] args) {
      int a = 10;
      int [] arr = new int[5],b;
      
      arr[0]=1;
      arr[1]=12;
      arr[2]=14;
      arr[3]=15;
      arr[4]=16;
      
      
      try
      {
       arr[5]=178;   
      }
      
      catch(ArrayIndexOutOfBoundsException e)
        {
        
            System.out.println(e.toString());
            
            System.out.println("Rest of the code");
            
            for(int i=0;i<2;i++)
            {
                System.out.println("code is running");
            }
        }
  }  
}
