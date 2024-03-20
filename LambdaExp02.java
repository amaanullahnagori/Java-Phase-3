import java.lang.*;
class LambdaExp02 
{
    public static void main(String[] args) {
        MyLambda j;
        j=()->{System.out.println("hello this lambda exp");};
        j.display();
    }
}
interface MyLambda 
{
    public void display ();
}