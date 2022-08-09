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

    class Address
    {
        String city,state,country;
        
     public Address (String city,String state, String country){
         this.city= city;
         this.state= state;
         this.country= country;
         
    }
     }
    
     class Aggregation
    {
        int id;
        String name;
        Address address;
        
        public Aggregation(int id, String name,Address address){
           this.id = id;
           this.name = name;
           this.address= address;

        } 
        
        void display()
        {
            System.out.println(id+""+name);
            System.out.println(address.city+""+address.state+""+address.country);
        }
        
    public static void main(String[] args) 
    {
        Address address1=new Address ("Karachi","NK","Pakistan");
        
        Address address2=new Address ("Karachi","NK","Pakistan");
       
        Aggregation e=new Aggregation(111,"abc",address1);
        Aggregation e2=new Aggregation(112,"asdjf",address2);
        
        e.display();
        e2.display();
    }
    }



