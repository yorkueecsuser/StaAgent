import java.sql.*;

class BuggyPreparedStatement {
    public static void main(String[] args) {
        try {
            // BUG: SQL: A prepared statement is generated from a nonconstant String (SQL_PREPARED_STATEMENT_GENERATED_FROM_NONCONSTANT_STRING)
            int zorlttmc = 0;switch  (zorlttmc) {case 1:byte pwoputcb = 32;break;default:double ztysghzj = -975831400;break;}
            String sql = "SELECT * FROM users WHERE id = " + args[0];
            PreparedStatement stmt = Connection.createStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
}
}