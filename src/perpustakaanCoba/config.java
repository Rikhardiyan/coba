package perpustakaanCoba;

// import bumbu-bumbu yang diperlukan
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

// bisa juga diimpor sekaligus seperti ini:
// import java.sql.*


public class config {
    
    private static Connection MySQLConfig;
    public static Connection configDB()throws SQLException{
       try{
           String url = "jdbc:mysql://localhost:3306/perpustakaan";
           String user = "root";
           String pass = "";
           
           DriverManager.registerDriver(new com.mysql.jdbc.Driver());
           MySQLConfig = DriverManager.getConnection(url, user, pass);
       }catch(SQLException e){
           System.out.println("Connection gagal" + e.getMessage());
        }
       return MySQLConfig;
    }
  }
    
