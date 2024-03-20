import java.lang.*;
//here i have not use lambda exp 
public class LambdaExp01
{
    public static void main(String[] args) {
     Lambda  m=new My();
        m.display();
    }
}
@FunctionalInterface 
interface Lambda 
{
     public void display ();
}
class My implements Lambda 
{
    @Override
    public void display(){
        System.out.println("Hello this is lambda expression");
    }
}