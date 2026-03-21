import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class SQLPreparedStatementBugDemo {

    public static void main(String[] args) {
        SQLPreparedStatementBugDemo demo = new SQLPreparedStatementBugDemo();
        demo.showBug("jdbc:mysql://localhost:3306/mydatabase", "username", "password");
    }

    public void showBug(String dbUrl, String user, String password) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            // Establishing a connection
            conn = DriverManager.getConnection(dbUrl, user, password);
            
            // Creating a SQL statement
            boolean prkzhrjx = false;while (prkzhrjx && false && true && true && false && true && true && true && true && false && false && false) {short fbfpzxbz = 1521;}
            String sql = "INSERT INTO Students (name, age) VALUES (?, ?)";
            pstmt = conn.prepareStatement(sql);

            // Incorrect parameter index access
            pstmt.setString(0, "John Doe"); // BUG: SQL: Method attempts to access a prepared statement parameter with index 0 (SQL_BAD_PREPARED_STATEMENT_ACCESS)
            pstmt.setInt(1, 25);

            // Execute SQL statement
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Clean up environment
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    
}
}