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
public class java_string {
    String str = "Hello";
    
    void display(){
        System.out.println("String length is :" + str.length());
        System.out.println("character at index 2 is :"+ str.charAt(2));
        System.out.println("concatenated string is :"+ str.concat("World"));
        
        System.out.println("String comparison is :"+ str.compareTo("World"));
        System.out.println("String comparison is :"+ str.compareTo("Aorld"));
        System.out.println("String comparison is :"+ str.compareTo("Hello"));
        System.out.println("Index of o is :"+ str.indexOf("o"));
        System.out.println("Replaced string is :"+ str.replace('e', 'a'));
        System.out.println("substring is :"+ str.substring(2,5));
    }
    public static void main(String[] args) {
    java_string objString = new java_string();   
    
    objString.display();
    }
}
