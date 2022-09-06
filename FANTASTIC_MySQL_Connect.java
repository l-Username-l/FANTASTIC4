import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FANTASTIC_MySQL_Connect {

   Statement stmt;
   public Statement SQL_connect() {

      // public Statement SQL_connect() {

      final String DB_URL = "jdbc:mysql://localhost/FANTASTIC4";
      final String USER = "root";
      final String PASS = "tbrs00002b";
      //Statement stmt;
      // Statement stmt;

      // Open a connection
      try {
         Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         stmt = conn.createStatement();

      } catch (SQLException e) {
         e.printStackTrace();
      }
      return stmt ; // stmt;
   }

  
}