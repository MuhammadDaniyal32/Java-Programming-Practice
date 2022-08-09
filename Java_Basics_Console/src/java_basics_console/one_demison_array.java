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
public class one_demison_array {
    
    int marks [][];
    
    public void storemarks()
    {
    marks = new int[4][3];
    
        System.out.println("Storing Marks . Please wait for while......");
        
        marks [0][0] = 23;
        marks [0][1] = 33;
        marks [0][2] = 13;
        marks [1][0] = 34;
        marks [1][1] = 35;
        marks [1][2] = 98;
        marks [2][0] = 43;
        marks [2][1] = 45;
        marks [2][2] = 66;
        marks [3][0] = 53;
        marks [3][1] = 46;
        marks [3][2] = 67;
    }
    
    void display()
    {
        System.out.println("Marks");
        System.out.println("Roll.1: " + marks[0][0]+ "," + marks[0][1]+ "," + marks[0][2]);
        System.out.println("Roll.2: " + marks[1][0]+ "," + marks[1][1]+ "," + marks[1][2]);
        System.out.println("Roll.3: " + marks[2][0]+ "," + marks[2][1]+ "," + marks[2][2]);
        System.out.println("Roll.4: " + marks[3][0]+ "," + marks[3][1]+ "," + marks[3][2]);
    }
    
    public static void main(String[] args){
    
        one_demison_array three_demisonobj = new one_demison_array();
        three_demisonobj.storemarks();
        three_demisonobj.display();
    }
}
