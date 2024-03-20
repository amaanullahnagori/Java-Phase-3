class LambdaExp07
{
    public static void main(String[] args) {
    lambda i;
   i=System.out::println;
   i.display("Amaan");      
}
}
interface lambda 
{
    public void display(String str);
}