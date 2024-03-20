import java.lang .*;
class LambdaExp05
{
    public static void main(String[] args) {
       P1 p=new P1();
       p.meth1();
    }
}
interface I2
{
    public void display () ;
}
class P1
{
    int instanceVariable =4;
    public void meth1()
    {
         final int count =0;
        I2 p;
       p=()->{
            System.out.println("hello");
            System.out.println("bye ");
            int x =10;
            System.out.println(x);
            System.out.println(count);  // if you are using local variable in the LE then it should be final 
            System.out.println(instanceVariable);// instance variable can be used in LEand they did not need to be final 
        };
    //instanceVariable++;
    p.display();
        
    }
}
/*  1. there can be any number of expression in the LE

2. local variable cannot be changed if once they are used in LEbut 
instance variable can be
changed */