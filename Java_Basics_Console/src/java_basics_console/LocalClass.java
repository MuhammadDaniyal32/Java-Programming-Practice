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
public class LocalClass {
    
    private int data=30234;
    
    public void display()
    {
        class local
        {
            void msg()
            {
                System.out.println(data);
            }
        }
        local l=new local();
        l.msg();
    }
    
    public static void main(String[] args) {
        
        LocalClass obj=new LocalClass();
        obj.display();
        
    } 
}
