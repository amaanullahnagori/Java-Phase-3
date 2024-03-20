class LambdaExp09
{
    public static void main(String[] args) {
        P1 v=new P1(); // it is required to made its object because you have not made uppercase 
        I i; // method static 
        i=v::upperCase;   
        i.display("amaan");        
   
}  
}
class P1
{
    public void upperCase(String p)
    {
        String q=p.toUpperCase();
        System.out.println(q);
    }
}
interface I
{
    public void display(String str);
 }