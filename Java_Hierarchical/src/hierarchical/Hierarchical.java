/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hierarchical;

/**
 *
 * @author asp
 */
public class Hierarchical {
    
    void abc(){
        System.out.println("Wail");
    }
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        two obj = new two();
        obj.display();
        
        obj.add();
        
        three obj1 = new three();
        obj1.div();
        obj1.display();
        
        
    }
    
}
