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

// Unreachable switch statement mutant
int value = getValue(); // getValue() returns a random integer
switch(value) {
    case 1:
        // code
        break;
    case 2:
        // code
        break;
    case 3:
        // code
        break;
    default:
        // code
        break;
}