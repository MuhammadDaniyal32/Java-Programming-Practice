/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Streamapi;

/**
 *
 * @author dani
 */
import java.util.*;
import java.util.stream.Collectors;

class Product3 {
    int id ;
    String name;
    float price;
    
    public Product3 (int id, String name,float price)
    {
        this.id= id;
        this.name= name;
        this.price= price;
    } 
}

public class StreamApi3 {

    public static void main(String[] args) {
      List <Product> productsList = new ArrayList<Product>();
      
      productsList.add(new Product(1,"HP Laptop",25000f));
      productsList.add(new Product(2,"Dell Laptop",22000f));
      productsList.add(new Product(3,"IBM Laptop",35000f));
      productsList.add(new Product(4,"Sony Laptop",45000f));
       productsList.add(new Product(5,"Apple Laptop",5000f));
       
      double totalPrice = productsList.stream().collect(Collectors.summingDouble(product -> product.price));
        System.out.println(totalPrice);
  }  
   
}


