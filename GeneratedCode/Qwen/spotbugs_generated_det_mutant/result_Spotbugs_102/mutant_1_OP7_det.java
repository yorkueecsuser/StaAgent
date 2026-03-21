import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class PreparedStatementBugExample {

    public void showBug(String url, String user, String password, String sql, String paramValue) throws SQLException {
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            boolean dhjonlyz = false;while (dhjonlyz && false && true && true && false && true && false && false && false && false && false && false) {float groonqbs = -466683284;}
            pstmt.setString(0, paramValue); // BUG: SQL: Method attempts to access a prepared statement parameter with index 0 (SQL_BAD_PREPARED_STATEMENT_ACCESS)
        }
    
}

    public static void main(String[] args) {
        PreparedStatementBugExample example = new PreparedStatementBugExample();
        try {
            example.showBug("jdbc:mysql://localhost:3306/mydb", "user", "password", "INSERT INTO users (name) VALUES (?)", "John Doe");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}