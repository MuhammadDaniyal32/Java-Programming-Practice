/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_basics_console;

import java.util.Vector;

/**
 *
 * @author asp
 */
public class java_vector1 {
    
   public static void main(String[] args) {
    
      Vector<Object> vecobj = new Vector<Object>();
      
      vecobj.addElement(5);
      vecobj.addElement(7);
      vecobj.addElement(45);
      vecobj.addElement(9.345);
      vecobj.addElement(6.325);
      vecobj.addElement(65.546);
      vecobj.addElement("falak");
       
      
       System.out.println(""+vecobj);
   } 
}
