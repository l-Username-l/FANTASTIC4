import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.locks.Condition;

public class FANTASTIC_MySQL_Connect {

   static final String DB_URL = "jdbc:mysql://localhost/fantastic4";
   static final String USER = "root";
   static final String PASS = "tbrs00002b";
   static Statement stmt;
   
   

   public static Statement SQL_connect(String query) {
      // Open a connection
      try {
         
         Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
         
         if (query.length() != 0) {
            stmt = conn.prepareStatement(query);
         } else {
            
         }
         
         // ResultSet rs = stmt.executeQuery(QUERY);

         //return stmt;

      } catch (SQLException e) {
         e.printStackTrace();
      }
      return stmt;
   }
}