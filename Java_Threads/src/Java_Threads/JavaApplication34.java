/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Java_Threads;

/**
 *
 * @author asp
 */
public class JavaApplication34 extends Thread{

    public static int value =0;
    public static void main(String[] args) {
        // TODO code application logic here
        JavaApplication34 obj = new JavaApplication34();
//        Thread obj1 = new Thread(obj);
        
        obj.start();
        System.out.println("Outside of Thread");
        while(obj.isAlive())
        {
            System.out.println("Waiting...");
        }
        System.out.println(value);
        value++;
        System.out.println(value);
        
    }
    
    public void run()
    {
        value++;
        System.out.println("Inside of running thread");
    }
    
    
    
}
