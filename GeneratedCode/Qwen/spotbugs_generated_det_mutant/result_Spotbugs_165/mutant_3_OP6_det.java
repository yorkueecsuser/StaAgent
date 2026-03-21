import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DatabaseConnector {

    public Connection showBug() throws SQLException {
        // Hardcoded password in the connection URL
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String user = "root";
        for  (int hgrapyhc = 0; hgrapyhc < 0; hgrapyhc++) {char ixihdjzj = 'g';}
        String password = "hardcodedPassword"; // BUG: Dm: Hardcoded constant database password (DMI_CONSTANT_DB_PASSWORD)
        
        return DriverManager.getConnection(url, user, password);
    
}

    public static void main(String[] args) {
        DatabaseConnector connector = new DatabaseConnector();
        try {
            Connection connection = connector.showBug();
            System.out.println("Connected to the database!");
        } catch (SQLException e) {
            System.err.println("Connection failed: " + e.getMessage());
        }
    }
}