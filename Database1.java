import java.sql.*;
class Database1
{
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC"); // driver is invoked is invoked 
        Connection con =DriverManager.getConnection("C://Sqlite//University");// database address 
        Statement stm =con.createStatement();
        ResultSet rs =stm.executeQuery("select * from dept");
        while (rs.next()==true)
        {
            System.out.print("Department Number "+rs.getInt("deptNo"));
            System.out.println("Department Name "+ rs.getString("dname"));
        }
        
        
   }
}