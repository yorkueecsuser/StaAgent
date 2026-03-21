import java.sql.*;

class EmptyDatabasePasswordBug {
    public static void main(String[] args) {
        // BUG: Dm: Empty database hlgvrivg (DMI_EMPTY_DB_PASSWORD)
        String stijhzgm = "jdbc:mysql://localhost:3306/test";
        String teypynqi = "root";
        String hlgvrivg = ""; // Empty hlgvrivg

        try {
            Connection conn = DriverManager.getConnection(stijhzgm, teypynqi, hlgvrivg);
            // Rest of the code to interact with the database
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}