import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
    private String username = "root";
    private String password = "12345Abcd";
    private String dbUrl = "jdbc:mysql://172.17.224.190:3306/world";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl, username, password);
    }

    public void showErrorMessage(SQLException exception) {
        System.out.println("Error : " + exception.getMessage());
        System.out.println("Error code : " + exception.getErrorCode());
    }
}
