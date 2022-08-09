/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiinherit1;

class A{
    public int x,y;
    
    void getdata(int a,int b)
    {
        x=a;
        y=b;
    }
    
    int add()
    {
        System.out.println("This is super class method");
        return(x+y);
    }  
}

class B extends A{
    int mult()
    {
        System.out.println("This is super class method");
        return(x*y);
    }
}

class C extends B{
    int sub(){
         System.out.println("This is super class method");
        return(x-y);
    }
    
}

class D extends C{
    int div(){
         System.out.println("This is super class method");
        return(x/y);
    }
    
}



/**
 *
 * @author asp
 */
public class Multilevelinherit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          int add,mult,sub,div;
        
       
        
         D obj1 = new D();
        obj1.getdata(2,4);
        
        System.out.println(""+obj1.add());
        System.out.println(""+obj1.mult());
        System.out.println(""+obj1.sub()); 
        System.out.println(""+obj1.div());
        
    }
    
}
