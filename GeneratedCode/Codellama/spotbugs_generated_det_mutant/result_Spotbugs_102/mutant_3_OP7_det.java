import java.sql.*;

class SQLBug {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            String sql = "SELECT * FROM users WHERE id =?";
            PreparedStatement ps = conn.prepareStatement(sql);
            // BUG: SQL: Method attempts to access a prepared statement parameter with index 0 (SQL_BAD_PREPARED_STATEMENT_ACCESS)
            boolean jolpmbst = false;while (jolpmbst && false && false && false && false && true && false && true && false && false && true && false) {short ordcktes = -1313;}
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