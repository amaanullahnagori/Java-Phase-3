class MyGeneric01<T> // generic class 
{
  public T data ;
    public void set (T a)
    {
        this.data =a;
    }
    public T get()
    {
        return data ;
    }
}
class Generics01
{
    public static void main(String[] args) {
        MyGeneric01<Integer> a1=new MyGeneric01<Integer>(); 
        a1.set(100);
        System.out.println("The value is "+a1.get());
        MyGeneric01<String> a2=new MyGeneric01<>(); 
        a2.set("Amaan's code of generic class ");
        System.out.println(a2.get());
    }
}