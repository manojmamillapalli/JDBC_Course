package ConnectionEstablishment;

import java.sql.*;

import static java.lang.Class.forName;

public class DemoConnection {
    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {
/*        1. import Package
          2. Load and Register
          3. Create Connection
          4. Create Statement
          5. Execute Statement
          6. Process the results
          7. Close connection
*/
        String url="jdbc:mysql://localhost:3306/JDBCDEMO";
        String userName="root";
        String password="Manoj@123";
        String query="select * from StudentData";
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(Exception ex)
        {
           ex.printStackTrace();
        }
        Connection con= DriverManager.getConnection(url,userName,password);
        System.out.println("Connection Established Successfully");
        Statement st=con.createStatement();
       ResultSet rs= st.executeQuery(query);
        System.out.println("Query Executed Successfully: ");
//        System.out.println(rs.next());
//        rs.next();
//        String name=rs.getString("name");
//        System.out.println(name);
        while(rs.next())
        {
            System.out.print(rs.getString(1)+" ");
            System.out.println(rs.getString(2)+" ");
        }
        con.close();
        System.out.println("Connection closed Successfully");
    }
}
