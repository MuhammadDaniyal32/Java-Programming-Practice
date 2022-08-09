/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiinherit1;

/**
 *
 * @author asp
 */
public class test extends student {
    int marks1, marks2;
    
    void getmarks(int x, int y){
        
        marks1= x;
        marks2= y;
        
    }
    
    void putmarks(){
        System.out.println("Test 1 marks is:"+marks1);
        System.out.println("Test 2 marks is:"+marks2);
    }
    
    
}
