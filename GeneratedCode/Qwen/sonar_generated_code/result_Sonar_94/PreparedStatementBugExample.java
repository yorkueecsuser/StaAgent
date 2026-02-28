import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class PreparedStatementBugExample {

    // Method to demonstrate the bug
    public String showBug(String url, String user, String password) {
        String result = "";
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement("SELECT name FROM users WHERE id =?")) {
            
            // Setting parameter with invalid index (should be 1, not 0)
            pstmt.setString(0, "1"); // BUG: "PreparedStatement" and "ResultSet" methods should be called with valid indices
            
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    // Accessing column with invalid index (should be 1, not 0)
                    result = rs.getString(0); // BUG: "PreparedStatement" and "ResultSet" methods should be called with valid indices
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args) {
        PreparedStatementBugExample example = new PreparedStatementBugExample();
        // Example usage with dummy database URL, user, and password
        System.out.println(example.showBug("jdbc:mysql://localhost:3306/mydb", "root", "password"));
    }
}