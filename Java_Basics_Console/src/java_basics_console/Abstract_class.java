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

 
    abstract class a{
        
        void ab ()
        {
            System.out.println("abstract class a method ");  
        }
    }
        class b extends a
        {
         void scc ()
         {
             System.out.println("this is b method");
        }   
        }
        
        abstract class c extends b{
            abstract public void aa();
        }
        
        class d extends c
        {
            public void aa ()
            {
                System.out.println("this is c method");
            }
            
            void aaa()
            {
                System.out.println("this is d method");
            }
        }
        
      public class Abstract_class {
          public static void main(String[] args) {
              d obj =new d();
              
              obj.aa();
              obj.aaa();
              obj.ab();
              obj.scc();
          }
    }

   

