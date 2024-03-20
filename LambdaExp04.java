import java.lang .*;
class LambdaExp04
{
    public static void main(String[] args) {
        
        I1 i;
        i=(str)->{System.out.println("heeloooo "+str);};
        i.display("Amaan");
    }
}
        
interface I1
{
public void display (String str);
}