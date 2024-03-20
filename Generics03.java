class MyGenerics03
{ 
    public <T>void Array (T[] a)
    {
        for(T x:a)
        {
            System.out.println(x);
        }
    }
}
class Generics03
{
    public static void main(String[] args) {
        MyGenerics03 g=new MyGenerics03();
        String str[]={"Amaan","Nagori"};
        g. Array(str);
        Float f[]={20.312f,45.078f};          
        g. Array(f);
    }
}