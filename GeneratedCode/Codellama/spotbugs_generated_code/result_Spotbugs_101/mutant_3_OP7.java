import java.sql.*;

class SQLBadResultSetAccess {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");

            // BUG: SQL: Method attempts to access a result set field with index 0 (SQL_BAD_RESULTSET_ACCESS)
            String username = rs.getString(0);

            System.out.println("Username: " + username);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

// Mutant 1: Unreachable while loop
class SQLBadResultSetAccess {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");

            // BUG: SQL: Method attempts to access a result set field with index 0 (SQL_BAD_RESULTSET_ACCESS)
            String username = rs.getString(0);

            // Mutant 1: Unreachable while loop
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
                System.out.println("This loop will never execute.");
            }

            System.out.println("Username: " + username);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static boolean getCondition() {
        return false;
    }
}