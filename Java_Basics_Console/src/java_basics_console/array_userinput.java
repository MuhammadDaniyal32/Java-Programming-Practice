/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_basics_console;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author asp
 */
public class array_userinput {
    
    ArrayList<Integer> list = new ArrayList<Integer>();
    Scanner scan = new Scanner(System.in);
    int n,
    total = 0;
    void getval(){
        
        System.out.println("Array list (Integer)-Create & Insert");
        System.out.println("\nEnter 'n' value:");
        n = scan.nextInt();
        System.out.println("Enter the data");
        
        for(int i=0; i<n; i++){
            list.add(scan.nextInt());
        }
        
    }
    
    void display(){
    
        System.out.println("\n The Arraylist");
        
        if (list.isEmpty())
        {
            System.out.println("ArrayList is Empty..");
        }
        
        else {
        
            for (int i=0; i<list.size(); i++){
                total +=list.get(i);
            }
            System.out.println(total);
        }
    }
    
   public static void main(String[] args){
       
       array_userinput  obj = new array_userinput();
       
       obj.getval();
       obj.display();
       
   } 
}
