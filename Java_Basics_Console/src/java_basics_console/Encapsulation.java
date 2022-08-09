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
public class Encapsulation {
    
 private int id ;
 protected String name;
 private String address;
 private int extensionNO;
 
    
   public void get()
   {
       address = "abc";
       extensionNO = 45;
       id = 33;
       System.out.println(id);
   }

    public static void main(String[] args) {
        
        child obj = new child();
        obj.get();
        obj.show();
        
        
}
}
