/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Streamapi;

/**
 *
 * @author asp
 */
import java.util.*;
class Product2 {
    int id ;
    String name;
    float price;
    
    public Product2 (int id, String name,float price)
    {
        this.id= id;
        this.name= name;
        this.price= price;
    } 
}

public class StreamApi2 {

    public static void main(String[] args) {
      List <Product> productsList = new ArrayList<Product>();
      
      productsList.add(new Product(1,"HP Laptop",25000f));
      productsList.add(new Product(2,"Dell Laptop",22000f));
      productsList.add(new Product(3,"IBM Laptop",35000f));
      productsList.add(new Product(4,"Sony Laptop",45000f));
       productsList.add(new Product(5,"Apple Laptop",5000f));
       
      long count = productsList.stream().filter(product -> product.price < 30000).count();
        System.out.println(count);
       
  }  
   
}

