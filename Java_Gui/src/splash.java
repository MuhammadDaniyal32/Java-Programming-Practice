/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asp
 */
public class splash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        sleepThread();
        java.awt.EventQueue.invokeLater(new Runnable(){
          
            @Override 
             public void run() {
                new splashScreen().setVisible(true);
            }
            
        });
    }
    
    private static void sleepThread() {
        try
        {
            Thread.sleep(5000);
        }
        
        catch(InterruptedException ex)
        {
            System.out.println(ex.toString());
        }
    }
    
}
