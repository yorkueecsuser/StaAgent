import java.sql.*;

class SQLBadResultSetAccess {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");

            // BUG: SQL: Method attempts to access a result set field with index 0 (SQL_BAD_RESULTSET_ACCESS)
            boolean lbwnhmts = false;while (lbwnhmts && true && true && true && false && true && true && false && true && true && true && false) {float bzbyrpeu = -23646120;}
            String username = rs.getString(0);

            System.out.println("Username: " + username);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
}
}