import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Scanner ;
class SerialiZation
{
    public static void main(String[] args) throws Exception{
          HashMap<String,StudentKMS> hm=new HashMap();
          StudentKMS k;
          try {
             FileInputStream fis =new FileInputStream("D:\\MyJava\\Section C.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            int a=ois.readInt();
            
            for (int i=0;i<a;i++)
            {
             k=  (StudentKMS) ois.readObject();
             hm.put(k.name,k);
            }
            
          System.out.println(hm);
          
          
          }
          catch (Exception e){}
          
            StudentKMS s1=   new StudentKMS ("Andy",1);
            StudentKMS s2 = new StudentKMS ("David",2);
            StudentKMS s3= new StudentKMS ("Leo",3);
            
            
           
                    
            hm.put("Andy",s1);
            hm.put("David",s2);
            hm.put("Leo",s3);
            FileOutputStream fos1 =new FileOutputStream("D:\\MyJava\\Section C.txt");
            ObjectOutputStream oos=new  ObjectOutputStream(fos1);
            oos.writeInt(StudentKMS.count);
            for (StudentKMS h:hm.values())
            { 
                oos.writeObject(h);
            }
          //  hm.remove("Andy");
            
            
    }
}

            


    
//     oos.writeInt (s.length);
//     for (int i=0;i<s.length;i++)
//     { 
//         oos.writeObject(s[i]);
//         
//     }
//     oos.close ();
//     fos1.close();
//
//     
//  FileInputStream fis1 =new FileInputStream("D:\\MyJava\\Section A.txt");
// ObjectInputStream ois=new  ObjectInputStream(fis1);
// int a=ois.readInt ();
// StudentKMS h=null;
// for (int j=0;j<a;j++)
// {
  //  h[j]=(StudentKMS) ois.readObject();
     //System.out.println(h[j]);
  //   hm.put(key, h)
// }
// LocalDate ld=LocalDate.now ();
//        System.out.println("Date :- "+ld);
//        LocalTime lt=LocalTime.now ();
//        System.out.println("Time :- "+lt);         
//         
// Scanner sc=new Scanner (System.in );
//        System.out.println("ENTER THE NAME OF STUDENT YOU WANT TO SEARCH");
// String str =sc.nextLine ();
// int k;
//  for ( k=0;k<a;k++)
//  {
//      if ((h[k].name).equals(str))
//      {
//           System.out.println(h[k]);   
//           break;
//          
//      }
//  }
//  if(k==a)
//  {System.out.println("STUDENT NOT FOUND ");
//  }
// ois.close ();
// fis1.close ();
//
//}
//} 


class StudentKMS implements Serializable
{
    String name ;
    int  roll_no;
     String student_ID;
     static int count =0;
    
    public StudentKMS (){}
    public StudentKMS (String name ,int  roll_no)
    {  
        count++;
        this.student_ID="S"+count ;
        this.name=name ;
        this.roll_no=roll_no;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", roll_no=" + roll_no + ", student_ID=" + student_ID + '}';
    }
    
}

