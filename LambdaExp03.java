
import java.lang.*;
class LambdaExp03
{
    public static void main(String[] args) {
        Lambda l;
        l=(a,b)->{return (a+b);};
      int f=l.add(2030, 10);
        System.out.println(f);
        
    }
}
interface Lambda
{
    public int add(int a,int b);
}