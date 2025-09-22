package CRUD_Operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudOperations
{
    public static void main(String[] args) throws SQLException, ClassNotFoundException
    {
        //CRUD Operations
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        String url="jdbc:mysql://localhost:3306/JDBCDEMO";
        String username="root";
        String password="Manoj@123";
        //String query="ALTER TABLE StudentData ADD marks long"; // Added Marks col for the Data
        Connection con= DriverManager.getConnection(url,username,password);
        System.out.println("Connected to database successfully");
        Statement st=con.createStatement();
       // st.executeUpdate(query);
        //System.out.println("Successfully Executed the Update Query");
        String insertQuery="INSERT INTO StudentData (id, name, marks) VALUES (3, 'SusmithaChowdary', 100.000)";
        st.execute(insertQuery);
        System.out.println("Successfully Executed the Insert Query");
        con.close();

    }
}
