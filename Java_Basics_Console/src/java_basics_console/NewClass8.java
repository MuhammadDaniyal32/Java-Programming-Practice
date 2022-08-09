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
public class NewClass8 {
    int a,b,c;
    void getdata(int x , int y)
    {
        a = x;
        b = y;
    }
    
     void add()
   {

       c= a+b;
       System.out.println("add is" + c);
   }
      void sub()
   {
       c= a-b;
       System.out.println("sub is " + c);
   }    
void mul()
   {
        c= a*b;
       System.out.println("mul is " + c);
   }   

   void dev()
   {
       float c= (float) a/b;
       System.out.println("dev is" + c);
   }
   void greater()
   {
   if(a>b)
   {
       System.out.println("a is greater than b"); 
   }
   else
   {
       System.out.println("b is greater than a");
   }
   }
    
    public static void main(String[] args) {
        
        NewClass8 sum= new NewClass8();
        sum.getdata(2,1);
        sum.add();
        sum.dev();
        sum.mul();
        sum.sub();
        sum.greater();

    }
    
}

