import java.sql.*;

class SQLBadResultSetAccess {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");

            // BUG: SQL: Method attempts to access a result set field with index 0 (SQL_BAD_RESULTSET_ACCESS)
            String username = rs.getString(0);

            // Mutant 1: Duplicate the assignment statement and insert immediately after its current location
            String username_mutant1 = rs.getString(0);

            System.out.println("Username: " + username);
            System.out.println("Username: " + username_mutant1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}