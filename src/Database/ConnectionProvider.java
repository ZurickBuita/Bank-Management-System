package Database;

import java.sql.*;

public class ConnectionProvider {
    public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bms", "root", "");
            System.out.println("Connected to the database!");
            return con;
        }
        catch(Exception e)
        {
            System.out.println("Database connection failed: " + e.getMessage());
            return null;
        }
    }

}
