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
public class arrry {
    
        ArrayList<Integer> list = new ArrayList<Integer>();
    Scanner scan = new Scanner(System.in);
    int n;
    
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
                System.out.println(list.get(i));
            }
        }
    }
    
     public static void main(String[] args){
        ArrayList<Integer> marks = new ArrayList<Integer>();
        
        marks.add(40);
        marks.add(50);
        marks.add(60);
        marks.add(1230);
        marks.add(40000);
        
      
         
         int total = 0;
         double avg = 0;
         
         for (int i = 0; i<marks.size();i++){
             total = total + marks.get(i);
             avg = total / marks.size();
         }
             System.out.println("The avg of array is :"+ marks);
             System.out.println("The sum of array is :"+ total);
             System.out.println("the avg of array is :"+ avg);
         
         
     }
}
