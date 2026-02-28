import java.sql.*;

class DbConnect {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = ""; // BUG: Dm: Empty database password (DMI_EMPTY_DB_PASSWORD)

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database successfully");
        } catch (SQLException e) {
            System.out.println("Error connecting to database");
        }
    }
}

// Unreachable for loop mutant
class DbConnect {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = ""; // BUG: Dm: Empty database password (DMI_EMPTY_DB_PASSWORD)

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database successfully");
            for (int i = 0; false; i++) {
                // unreachable code
                System.out.println("This code should never be reached.");
            }
        } catch (SQLException e) {
            System.out.println("Error connecting to database");
        }
    }
}