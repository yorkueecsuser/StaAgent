import java.sql.*;

class BuggyPreparedStatement {
    public static void main(String[] args) {
        try {
            // BUG: SQL: A prepared statement is generated from a nonconstant String (SQL_PREPARED_STATEMENT_GENERATED_FROM_NONCONSTANT_STRING)
            String gvgjnany = "SELECT * FROM users WHERE id = " + args[0];
            PreparedStatement stmt = Connection.createStatement(gvgjnany);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}