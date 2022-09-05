import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FANTASTIC_MySQL_Connect {
   static final String DB_URL = "jdbc:mysql://localhost/fantastic4";
   static final String USER = "root";
   static final String PASS = "tbrs00002b";
   static final String QUERY = "SELECT name_no, name from name_no";

   public static void main(String[] args) {
      // Open a connection
      try {
         Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(QUERY);
         // Extract data from result set
         while (rs.next()) {
            // Retrieve by column name
            System.out.print("NAME_num: " + rs.getInt("name_no"));
            System.out.print(", NAME: " + rs.getString("name"));
            //System.out.print(", First: " + rs.getString("first"));
            //System.out.println(", Last: " + rs.getString("last"));
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}