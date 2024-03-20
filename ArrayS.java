import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

 class ArraY {
    public static void main(String[] args) {

       int  a[]= {11, 2, 32, 58,81};
       int b[]={11,2,32,5,9};
      int n= Arrays.compare(a,b);
        System.out.println(n);
        int c[]=Arrays.copyOf(a,7);
     //  Arrays.sort(b);
       
     //Arrays.sort(a, new MyComp());
     
        for (int z:a)
            System.out.println(z);
}

}

class MyComp implements Comparator<Integer>
{
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1<o2) return 1;
        else if (o1>o2) return -1;
        else return 0;

    }
}
