
import java.io.BufferedReader;         
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

class ReverseEchoServer extends Thread 
        {
Socket c;
    public ReverseEchoServer(Socket g) {
    this.c=g;
        }
    
    public static void main(String args []) throws Exception
    {
        ServerSocket ss=new ServerSocket (2001); // 2001 is a port address 
int count =1;
        do {
           Socket s= ss.accept();
            System.out.println("CLIENT"+count );
           ReverseEchoServer re=new ReverseEchoServer(s);
          re.start();
    }while (true);
                }
    

    @Override
  
       public  void run()
       {
             try {
            InputStreamReader i=new InputStreamReader (c.getInputStream());
        BufferedReader  bf =new BufferedReader (i);
        
        PrintStream ps =new PrintStream (c.getOutputStream());
        String str;
     do {
        str=bf.readLine();
        StringBuffer sb=new StringBuffer (str);
        sb=sb.reverse();
        //str =sb.toString();
       ps. println(sb);
     }
     while (!str.equals("dne"));
    }
       catch(Exception e ){System.out.println(e.getMessage());}
}

}


      

class Cliant 
{
    public static void main(String args []) throws Exception
    {
      Socket s=new Socket ("LocalHost",2001); // IP Address and PORT number of server 
        InputStreamReader i=new InputStreamReader (System.in);
        BufferedReader  kyb =new BufferedReader (i);
        InputStreamReader i1=new InputStreamReader (s.getInputStream());
        BufferedReader  bf =new BufferedReader (i1);
        
        PrintStream ps =new PrintStream (s.getOutputStream());
     
         
       String str;
       String msg ;

       System.out.println("ENTER THE STRING WHOSE REVERSE YOU WANT ");
            
     do {
        str =kyb.readLine();
         ps.println(str);
         msg =bf.readLine();
         System.out.println("MESSAGE FROM THE SERVER IS :-"+msg);
     }
     while (!str.equals("dne"));
     s.close();
    }
}