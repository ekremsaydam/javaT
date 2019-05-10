import java.sql.*;
public class DbHelper {
   private String userName = "root";
   private String password = "12345Abcd";
   private String dbUrl = "jdbc:mysql://172.17.224.190:3306/world?useSSL=false";
   
   public Connection getConnection() throws SQLException {
       return DriverManager.getConnection(dbUrl,userName,password);
   }
   
   public void showErrorMessage(SQLException exception) {
       System.out.println("Error : "+exception.getMessage());
       System.out.println("Error code : "+exception.getErrorCode());
   }
}
