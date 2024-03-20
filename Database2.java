import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.ResultSet;
class Database2
{
    public static void main(String[] args) throws Exception {
        Class.forName("sqlite.org.JDBC");
        Connection con =DriverManager.getConnection("sqlite .C://sqlite//University");
        PreparedStatement ps =con.prepareStatement("select *from dept where dNo=?");
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the department number ");
        int dNo=sc.nextInt();
        ps.setInt(1, dNo);
        ResultSet rs =ps.executeQuery();
        while(rs.next())
        {
            System.out.print(rs.getInt("dno")+" ");
            System.out.println(rs.getString("dName"));
            
        }
        
        
        
            
    }
}