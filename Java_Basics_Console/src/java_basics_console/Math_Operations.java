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
public class Math_Operations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int a= 20;
        int b= 30;
        
        System.out.println("a == b =" + (a == b));
        System.out.println("a != b =" + (a != b));
        System.out.println("a > b =" + (a > b));
        System.out.println("a < b =" + (a < b));
        System.out.println("a >= b =" + (a >= b));
        System.out.println("a <= b =" + (a >= b));
        
          int e = 1;
        int d = 2;
        int f= e+d;
        
//               task

        System.out.println("1 + 2=" + (e + d));
        System.out.println("3 - 1=" + (f=f-1));
        System.out.println("2 * 2=" + (f=f * 2));
        System.out.println("4 / 2=" + (f=f / 2));
        System.out.println("2 + 8=" + (f=f + 8));
        System.out.println("10 % 7=" + (f=f % 7));
        
//         conditional operators

      int r,t;
      r= 10;
      
      t= (a == 10) ? 20 : 30;
        System.out.println("value of b is :" + b);
        String c = (r%2==0) ? "even":"odd";
        System.out.println("value of b is :" + c);
        
//        task2

     double pi = 3.14159;
     double radius = 5.87;
       double circle = pi * radius * radius;
       
        System.out.println("value of pi =" + pi);
        System.out.println("value of radius =" + radius);
        System.out.println("area of circle is =" + circle);
    }
    
}
