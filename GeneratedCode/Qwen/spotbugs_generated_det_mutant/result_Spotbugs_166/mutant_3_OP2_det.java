import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DatabaseConnector {
public Connection showBug(String url , String user)throws SQLException {
    Connection conn = DriverManager.getConnection(url , user , "");
    conn = DriverManager.getConnection(url , user , "");
    return conn;
}

    public static void main(String[] args) {
        DatabaseConnector dbConnector = new DatabaseConnector();
        try {
            // Example usage with an empty password
            Connection connection = dbConnector.showBug("jdbc:mysql://localhost:3306/mydb", "root");
            System.out.println("Connected to the database.");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}