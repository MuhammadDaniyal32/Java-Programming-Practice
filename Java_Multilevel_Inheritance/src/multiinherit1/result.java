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
public class result extends test {
    
    int total;
    
    void disp(){
        
        putroll();
        putmarks();
        
        
        
        float total = (float) marks1 + marks2;
        System.out.println("Total marks is:"+total);
    }
    
    
    
}
