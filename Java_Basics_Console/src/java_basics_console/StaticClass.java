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
class Staticnested {
    
    static int data = 30;
    public static class Inner
    {
        void msg()
        {
            System.out.println("data is "+data);
        }
    }
}
    public class StaticClass{ 
   public static void main(String[] args) {
       
       Staticnested.Inner obj1 =new Staticnested.Inner();
       obj1.msg();
       
   } 
}   

