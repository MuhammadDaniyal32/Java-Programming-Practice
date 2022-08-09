/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Java_Generic_Class;

/**
 *
 * @author asp
 */
public class JavaApplication36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         /*Generic_class<String> obj= new Generic_class<String>();
        obj.show(new String("DANIYAL"));
        System.out.println(obj.get());
        
        Generic_class<Double> obj1= new Generic_class<Double>();
        obj1.show(new Double(10.1332));
        System.out.println(obj1.get());*/
        
        Gen<String,Integer> obj = new Gen<>("daniyal",2131);
        System.out.println(obj.getKvalue());
        System.out.println(obj.getVvalue());
        
        Integer i = 12;
        Double d= 12.11;
        Character c = 'c';
        System.out.println(i.intValue());
        System.out.println(d.doubleValue());
        System.out.println(c.charValue());
        
        String str = d.toString();
        System.out.println(str.length());
        
    }
    
}

class Gen<K,V>
{
    private K k;
    private V v;
    public Gen(K k,V v)
    {
        this.k=k;
        this.v=v;
        
    }
    public K getKvalue()
    {
        return k;
    }
    public V getVvalue()
    {
        return v;
    }
}

class Generic_class<T>
{
    private T t;
    
    public T get()
    {
        return t;
    }
    public void show (T t)
    {
        this.t=t;
    }
    
}
