import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Scanner;


class StudenT implements Serializable 
{
     String name ;
    short roll_no;
    String studentID;
  
     static int count =1;
     
    public StudenT(short roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
        studentID="S"+count ;
        count++;
    }

    public StudenT() {  }

    @Override
    public String toString() {
        return "StudenT{" + "name=" + name + ", roll_no=" + roll_no +
                '}';
    }
}
class SerialiZablE 
{
    public static void main(String[] args)  throws Exception {
           StudenT t=null;
       
              HashMap<String ,StudenT> tm=new HashMap();
        try {
       
            FileInputStream fis =new FileInputStream ("D:\\\\MyJava\\\\Data1.txt");
            ObjectInputStream ois =new ObjectInputStream (fis);
            int v=ois.readInt();
            for(int i=0;i<v;i++)   
            {
                t=(StudenT)ois.readObject();
                tm.put(t.name,t);
            }
            }
        catch (Exception e)
        {
         
        }
      
       Scanner sc=new Scanner (System.in );
    
       byte  a;
       FileOutputStream fis=new FileOutputStream("D:\\MyJava\\Data1.txt");
       ObjectOutputStream oos =new ObjectOutputStream(fis);
               do{
         System.out.println("1. To creat Student in the database ");
        System.out.println("2. To view the student ");
        System.out.println("3. To view all the Student in the database ");
        System.out.println("4. to delete the Student Account ");
        System.out.println("5.  Save");
       
        byte b= sc.nextByte();
             switch(b)
             {     case 1:
          System.out.println("Enter the name and roll number of Student respectively");
                 String str =sc.next ();
                 short b1=sc.nextShort();
                 t=new StudenT(b1,str);
                 tm.put(str, t);
               System.out.println("Student Account is created ");
                 break;
                 
             case 2:
                 System.out.println("Enter the Student name ");
                 String str2=sc.next ();
                 StudenT l;
                  l=tm.get(str2);
                  System.out.println(l.toString());
                  break;
                
             case 3:
                 
                for (StudenT h:tm.values())
                {System.out.println(h.toString());}
                break;
                 
             case 4:
                 System.out.println("Enter the Student name ");
                 String str1=sc.next();
                 tm.remove(str1);
                 break ;
                         
             case 5:
                 oos.writeInt(tm.size());
                 for (StudenT u:tm.values())
                 { oos.writeObject(u);}
                 System.out.println("Account is saved ");
                 break;
             }
     
                 System.out.println("Want to countinue then press 1 else 0 to exit  ");
                 a=sc.nextByte();
                 do{
               if (a!=0&&a!=1)
               {
                   System.out.println("Wrong input ");
                   
                 System.out.println(" Press 1 to countinue else 0 to exit  ");
                 a=sc.nextByte();
           
               }
                 }
                 while (a!=0&&a!=1);
}
        while (a==1);
       
    }
}