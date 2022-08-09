/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implicit.and.explicit.type.casting;

/**
 *
 * @author asp
 */
public class ImplicitAndExplicitTypeCasting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        byte i =60;
        
        
        short j=i;
        int k= j;
        long l=k;
        float m=l;
        double n=m;
        
        System.out.println("Byte value is:"+i);
        System.out.println("Short value is:"+j);
        System.out.println("int value is:"+k);
        System.out.println("Long value is:"+l);
        System.out.println("Float value is:"+m);
        System.out.println("Double value is:"+n);
        
    }
    
}
