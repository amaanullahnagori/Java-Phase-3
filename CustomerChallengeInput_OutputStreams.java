import java.io.*;
import java.util.Scanner;
 
 class SerializatioN {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Customer [] list ={new Customer("Amaan",8770420698l),new Customer("Rohaan",8976413216l)};
        FileOutputStream fos =new FileOutputStream("D:\\MyJava\\Customer.txt");
        ObjectOutputStream dos=new ObjectOutputStream(fos);
        dos.writeInt(list.length); // length of array isliye write karai file me taki jab bhi input karana ho
         for (Customer c:list ) // file se to array ki length ke barabar loop chala sake :)
        {
            dos.writeObject(c);
            //System.out.println(c);
        }
       Customer listA =null;
        FileInputStream fis =new FileInputStream("D:\\MyJava\\Customer.txt");
        ObjectInputStream ois =new ObjectInputStream(fis);
        int a=ois.readInt();  // sare objects ko read karne ke liye loop ka use kiya agar nahi karte to sirf pehla
        // for (int i=0;i<a;i++) // object print ho jata
//        {
//            System.out.println(ois.readObject());
//        }
//        {
//            listA=(Customer) ois.readObject();
//            System.out.println(listA.toString());
//        }
        Customer g[]=new Customer[a];
        for(int i=0;i<a;i++)
        {
            g[i]=(Customer)ois.readObject();
            System.out.println(g[i]);
        }
        System.out.println("Enter the name of Customer");
        Scanner sc=new Scanner (System.in );
        String str=sc.next();
        for(int i=0;i<g.length;i++) {
            if (str.equals(g[i].name) )
            {  System.out.println(g[i]);}
            else
            { System.out.println("NO MATCH FOUND");}
            break;
        }
    }
}
class Customer implements Serializable
{
    String cusID,name;
    long phNo;
    static int count =0;
   public  Customer()
   {

   }
   public Customer( String name, long phNo) {
       count ++;
        this.cusID = "C"+count ;
        this.name = name;
        this.phNo = phNo;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cusID='" + cusID + '\'' +
                ", name='" + name + '\'' +
                ", phNo=" + phNo +
                '}';
    }
}