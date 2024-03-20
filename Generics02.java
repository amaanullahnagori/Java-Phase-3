   class  MyGenerics02<A>
 {
     A a[]=(A[])new Object [3];
     int length=a.length;
     public void add (A element )
         {
             a[--length]=element ;
         }
   public void returnn ()
   {
       System.out.print("The given array is \n { ");
for (int i=0;i<3;i++)
{
    System.out.print(a[i]+" ");
    }
       System.out.println("}");

    }
 }
class Generics01
{
    public static void main(String[] args) {
         MyGenerics02<Integer > i=new MyGenerics02<>();
         i.add(10);
         i.add(20);
          i.add(30);
          i.returnn ();
         
    }
}