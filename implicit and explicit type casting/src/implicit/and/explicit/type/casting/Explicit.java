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
public class Explicit {
    public static void main(String[] args) {
    double d=56.8;
    
    float f=(float) d;
    long l=(long) f;
    int i=(int) l;
    short s=(short) i;
    byte b = (byte) s;
    
    System.out.println("double value is:"+d);    
    System.out.println("double value is:"+f);
    System.out.println("double value is:"+l);
    System.out.println("double value is:"+i);
    System.out.println("double value is:"+s);
    System.out.println("double value is:"+b);
}
}