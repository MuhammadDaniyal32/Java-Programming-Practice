package java_basics_console;


import java.util.HashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asp
 */
public class java_hashset1 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("Q");
        hs.add("F");
        hs.add("F");
        
        System.out.println(hs);
    }
}
