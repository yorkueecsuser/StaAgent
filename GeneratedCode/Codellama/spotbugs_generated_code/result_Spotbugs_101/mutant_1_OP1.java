import java.sql.*;

class SQLBadResultSetAccess {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");

            String username = rs.getString(0);
            int deadStore = 123; // Dead Store

            System.out.println("Username: " + username);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}