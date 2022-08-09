package oops1;
public class OOPs1 extends Thread
{
    public static void main(String[] args)
    {
        A obj = new A();
        A.B obj1 = obj.new B();
        obj1.inner();

        C objj = new C()
        {
            public void eat()
            {
                System.out.println("Eat fast!");
            }
        };
        objj.eat();
        
        
        outer o = new outer();
        o.call();
        
        staticouter.staticinner oj  = new staticouter.staticinner();
        oj.call();
        
        
        simple op = new simple();
        op.bottommethod();
    }
}


class A
{
    private int a = 12;
    class B
    {
        public void inner()
        {
            System.out.println(a);
        }
    }
}

abstract class C
{
    abstract void eat();
}

class outer
{
    private int a = 1234;
    public void call()
    {
        System.out.println(a);
    class inner
    {
        public void call1()
        {
            System.out.println(a);
            inner obj = new inner();
            obj.call1();
        }
        
    }
    }
}



class staticouter
{
    static int value = 12;
    int data = 121;
    static class staticinner
    {
        public void call()
        {
            System.out.println(value);
          //  System.out.println(data);
        }
    }
}

interface top
{
    void topmethod();
    interface bottom
    {
        void bottommethod();
    }
}
class simple implements top.bottom
{
   public void bottommethod()
   {
       System.out.println("bottommethod interface");
   }
}