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
interface LambdaExpression{
    public void draw();
}


public class drawable1 {
    
    public static void main(String[] args) {
        
        int width=10;
        
        LambdaExpression d2 = ()->
        {
            System.out.println("Draw"+width);   
        };
        d2.draw();
    }
    
        
}
