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

class employee{
    
public int rollNO;
private int id;
private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

public class Encapsulation2 {
    public static void main(String[] args) {
        
        employee obj=new employee();
       // employee obj1=new employee();
        //obj1.rollNO(32);
        
        obj.setId(12);
        
        obj.setName("daniyal");
        
        System.out.println(obj.getId());
        System.out.println(obj.getName());
        System.out.println();
    }
    
}
