import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class FANTASTIC_MySQL_Connect {

   
   Statement stmt;

   public Statement SQL_connect() {
      
      final String DB_URL = "jdbc:mysql://localhost/fantastic4";
      final String USER = "root";
      final String PASS = "tbrs00002b";
      
      // Open a connection
      try {
         
         Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         stmt = conn.createStatement();
         // return stmt;

      } catch (SQLException e) {
         e.printStackTrace();
      }
      return stmt;

   }

   // FANTASTIC_MySQL_Connect con_arbi = new FANTASTIC_MySQL_Connect();
   // return con_arbi.stmt;
}