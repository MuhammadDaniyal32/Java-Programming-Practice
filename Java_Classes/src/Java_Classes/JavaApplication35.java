/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Java_Classes;

/**
 *
 * @author asp
 */
public class JavaApplication35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       A obj = new A();
       A.B obj1 = obj.new B();
       obj1.inner();
       
       c obj3 = new c()
       {
           public void eat()
           {
               System.out.println("dont Eat!!!"); 
           };
       };
       obj3.eat();
       
       outer obj4 = new outer();
       obj4.call();
    }
    
}

class A 
{
    private int a = 12;
    class B
    {
        public void inner()
        {
            System.out.println(a);
        }
    }
}

abstract class c 
{
    abstract void eat();
    
}

class outer 
{
    private int c = 23;
    public void call()
    {
        System.out.println(c);
        class inner
        {
            public void call2()
            {
                System.out.println(c);
                inner obj = new inner();
                obj.call2();
            }
        }
    }
}