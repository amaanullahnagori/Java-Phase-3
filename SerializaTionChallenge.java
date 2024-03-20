import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner ;
class SerialiZation
{
    public static void main(String[] args) throws Exception{
         StudentKMS s[]={new StudentKMS ("Andy",1),new StudentKMS ("David",2),new StudentKMS ("Leo",3)};
    
     FileOutputStream fos1 =new FileOutputStream("D:\\MyJava\\Section A.txt");
//    FileOutputStream fos2 =new FileOutputStream("D:\\MyJava\\Section B.txt");

     ObjectOutputStream oos=new  ObjectOutputStream(fos1);
    
     oos.writeInt (s.length);
     for (int i=0;i<s.length;i++)
     {   
         oos.writeObject(s[i]);
         
     }
     oos.close ();
     fos1.close();

     
     FileInputStream fis1 =new FileInputStream("D:\\MyJava\\Section A.txt");
 ObjectInputStream ois=new  ObjectInputStream(fis1);
 int a=ois.readInt ();
 StudentKMS h[]=new StudentKMS [a];
 for (int j=0;j<a;j++)
 {
    h[j]=(StudentKMS) ois.readObject();
     //System.out.println(h[j]);
 }
 LocalDate ld=LocalDate.now ();
        System.out.println("Date :- "+ld);
        LocalTime lt=LocalTime.now ();
        System.out.println("Time :- "+lt);
         
 Scanner sc=new Scanner (System.in );
        System.out.println("ENTER THE NAME OF STUDENT YOU WANT TO SEARCH");
 String str =sc.nextLine ();
 int k;
  for ( k=0;k<a;k++)
  {
      if ((h[k].name).equals(str))
      {
           System.out.println(h[k]);   
           break;
          
      }
  }
  if(k==a)
  {System.out.println("STUDENT NOT FOUND ");
  }
 ois.close ();
 fis1.close ();

}
} 


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

