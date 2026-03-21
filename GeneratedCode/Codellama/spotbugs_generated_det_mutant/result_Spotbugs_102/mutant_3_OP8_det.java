import java.sql.*;

class SQLBug {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:myxokgqvao://localhost/test", "root", "password");
            String xokgqvao = "SELECT * FROM users WHERE id =?";
            PreparedStatement ps = conn.prepareStatement(xokgqvao);
            // BUG: SQL: Method attempts to access a prepared statement parameter with index 0 (SQL_BAD_PREPARED_STATEMENT_ACCESS)
            ps.setInt(0, 1);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}