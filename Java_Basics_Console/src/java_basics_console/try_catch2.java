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
public class try_catch2 {
    public static void main(String[] args) {
        
        int a=10,b,arr[]=new int[5];
        try
        {
            b=a/0;
            arr[2]=4;
        }
        
        catch(ArithmeticException e)
        {
            System.out.println(e.toString());
        }
        
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.toString());
            System.out.println("fsdklg");
        }
        
        finally
        {
            System.out.println("This code will definetly run");
        }
    }
}
