import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class FANTASTIC_MySQL_Connect {

   static final String DB_URL = "jdbc:mysql://localhost/fantastic4";
   static final String USER = "root";
   static final String PASS = "tbrs00002b";
   static Statement stmt;
   
   

   public static Statement SQL_connect() {
      // Open a connection
      try {
         
         Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         stmt = conn.createStatement();
         
         
         // ResultSet rs = stmt.executeQuery(QUERY);

         //return stmt;

      } catch (SQLException e) {
         e.printStackTrace();
      }
      return stmt;
   }
}