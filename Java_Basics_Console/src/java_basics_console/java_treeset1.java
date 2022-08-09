/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_basics_console;

import java.util.TreeSet;

/**
 *
 * @author asp
 */
public class java_treeset1 {
    
    public static void main(String[] args) {
    
        TreeSet ts = new TreeSet();
        
        ts.add("c");
        ts.add("C");
        ts.add("A");
        ts.add("Q");
        ts.add("W");
        ts.add("T");
        ts.add("x");
        ts.add("x");
        
        System.out.println(ts);
        
        ts.add("Ali");
        ts.add("Talha");
        ts.add("Daniyal");       
        
        System.out.println(ts);
    }
}
