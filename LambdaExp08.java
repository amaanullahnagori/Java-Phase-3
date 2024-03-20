class LambdaExp08
{
    public static void main(String args [])
    {
        lambda i;
        i=P1::hell;
        i.display ("Amaan");
    }
}
interface lambda     
{
    public void display (String str);
}
class P1
{
    public static void hell(String s12)
    {
        
        StringBuilder  r=new StringBuilder (s12);
        r.reverse ();
        System.out.println(r);
  }
}