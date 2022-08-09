/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_basics_console;

import java.util.LinkedList;

/**
 *
 * @author asp
 */
public class linkedarray {
    
    
    
    public static void main(String[] args){
        LinkedList<Object> lisobj = new LinkedList<Object>();
        
        lisobj.add("Dani  ");
        lisobj.add("Arsalan");
        lisobj.add("Ahsan");
        lisobj.add("Aston Martin");
        lisobj.add(123);
        lisobj.add(12.3);
        lisobj.add(12.300000);
        
        System.out.println("Orginal content of list are:"+lisobj);
        lisobj.removeFirst();
        
        System.out.println("After removing first content of the list:"+lisobj);
        lisobj.removeLast();
        
         System.out.println("After removing last content of the list:"+lisobj);
        lisobj.remove(2);
        
        System.out.println("After removing 2nd content of the list:"+lisobj);
        lisobj.clear();
        
        System.out.println("After removing all content of the list:"+lisobj);
        
        lisobj.add("Jack");
        lisobj.add("Elvis");
        lisobj.add("abc");
        
        System.out.println("After adding first content of the list:"+lisobj);
    }
}
