class LambdaExp10
{
    public static void main(String args [])
    {
        P p;
      //  p=Concat ::  concatinate;
        //p.display("IIT ", "NIT");
        p=String ::compareTo;
        int q=p.display("IIT ", "NIT");
        System.out.println(q);
        System.out.println("Thanks ");
    }
}
interface P
{
    public int  display(String str1 ,String str2);
}
class Concat
{
    public static void concatinate (String p, String q )
    {
        String r= p.concat(q);
        System.out.println(r);
    }
}