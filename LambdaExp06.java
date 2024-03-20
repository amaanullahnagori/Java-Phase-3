import java.lang.*;
class LambdaExp06
{
    public static void main(String[] args) {
       P2 q=new P2();
      q.meth2();

    }
}
interface I3
{
    public void display ();
}
class P1
{
    public void meth1(I3 i)
    {
      i.display();
     }
}
class P2
{
    public void meth2()
    { 
        P1 p=new P1 ();
      p.meth1(()->{System.out.println("parametrized lambda expression");});
    }
    
}