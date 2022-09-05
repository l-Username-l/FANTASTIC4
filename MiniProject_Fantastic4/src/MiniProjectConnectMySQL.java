import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MiniProjectConnectMySQL {

    
    static final String DB_URL = "jdbc:mysql://localhost/FANTASTIC4";
    static final String USER = "localhost";
    static final String PASS = "tbrs00002b";
    static final String QUERY = "SELECT ID, name, Countrycode, district, population FROM city";
    public static void main(String[] args) {
        // VS code에서 폴더 만들기, Class 파일 만들기
        // Connect to database
        // Access to SQL server --> Mysql-connector J (Already done)
        // Check host name
        // Check user
        // Check Schema
        // Check password
        // Connection Method -jdbc (java DB connection)
  

        try {
            // Connect to the 'world' database
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
            // Open a statement (Edit window)
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);
            
            // Insert
            // int id = select max();
            String QUERY = "insert into city (ID, Name, Countrycode, district, population) " +
                    "values (98765, 'Name', 'AFG', 'District', 100)";
            int val = stmt.executeUpdate(QUERY); // val = 1

            // SELECT
            QUERY = "select ID, name, Countrycode, district, population " +
                    "from city " +
                    "where Name = 'Name'";
            rs = stmt.executeQuery(QUERY);
            // System.out.println();
            
            // Update
            QUERY = "update city "+
            "set population = 2000 "+
            "where Name = 'Name' ";
            val = stmt.executeUpdate(QUERY); // val = 2

            // Delete
            QUERY = "delete from city "+
            "where Name = 'Name' ";
            
            val = stmt.executeUpdate(QUERY); // val = 2




            while (rs.next()) {
                // Retrieve by column name
                System.out.print("Code: " + rs.getInt("Code"));
                System.out.print(", NAME: " + rs.getString("NAME"));
                System.out.print(", Continent: " + rs.getString("Continent"));
                System.out.print(", Capital: " + rs.getString("Capital"));

            }

            // Input Query on statement
            // String QUERY = "select Code, Name, Continent, Capital "+
            // "from country "+
            // "Where 1 = 1 "+
            // "and Name like \"%an&\";";

            // Insert the output from the execution into the 'rs' variable

            // Chekc the grid (line by line) and the result & action output

            // Get result from Query by row (Top-Down way)
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return;
        // Make Statments

    }
    
}
