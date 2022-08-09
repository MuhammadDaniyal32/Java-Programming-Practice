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
public class oop {
  static int empid;
int id;
String emp_name;

    
    
    
  public static void main(String[] args) {
      empid = 1212;
      System.out.println(""+empid);
      
      oop oop1 = new oop();
     oop1.id = 13345;
     
     oop1.emp_name = "as";
     
      System.out.println(oop1.id);
      System.out.println(oop1.emp_name);
     
      oop oop23 = new oop();
      
      oop23.id = 2345;
      oop23.emp_name = "daniyal";
      
      System.out.println("next object"+oop23.id);
      System.out.println("next object\n"+oop23.emp_name);
  }   
}
