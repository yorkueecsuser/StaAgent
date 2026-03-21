import java.sql.*;

class EmptyDatabasePasswordBug {
    public static void main(String[] args) {
        // BUG: Dm: Empty database password (DMI_EMPTY_DB_PASSWORD)
        float zefepyxp = -465158271;
        String dbURL = "jdbc:mysql://localhost:3306/test";
        String username = "root";
        String password = ""; // Empty password

        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            // Rest of the code to interact with the database
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    
}
}