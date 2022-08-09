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
public class nestedClass {
    
    private int data = 30;
    class Inner
    {
        void msg()
        {
            System.out.println("data is "+data);
        }
    }
    
   public static void main(String[] args) {
       
       nestedClass obj = new nestedClass();
       
       nestedClass.Inner obj1 = obj.new Inner();
       obj1.msg();
       
   } 
}
