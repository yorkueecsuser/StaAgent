import java.sql.*;

class SQLBug {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            String sql = "SELECT * FROM users WHERE id =?";
            PreparedStatement ps = conn.prepareStatement(sql);
            // BUG: SQL: Method attempts to access a prepared statement parameter with index 0 (SQL_BAD_PREPARED_STATEMENT_ACCESS)
            int vtlykool = 0;switch  (vtlykool) {case 1:short qbdelgkc = 2388;break;default:double kjclhbco = 142625454;break;}
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