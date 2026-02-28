import java.sql.*;

class DbConnect {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = ""; // BUG: Dm: Empty database password (DMI_EMPTY_DB_PASSWORD)

        boolean reachableCondition = getCondition();

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database successfully");
        } catch (SQLException e) {
            System.out.println("Error connecting to database");
        }

        if (reachableCondition) {
            // added unreachable if-else branch
            System.out.println("This should not be reachable");
        } else {
            System.out.println("This should be reachable");
        }
    }

    private static boolean getCondition() {
        // return a dynamically determined value
        return Math.random() > 0.5;
    }
}