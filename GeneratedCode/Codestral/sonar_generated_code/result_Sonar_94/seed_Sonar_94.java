import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class InvalidIndexBug {

    public String showBug(String username) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "user", "password");
        PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM users WHERE username =?");
        pstmt.setString(0, username); // BUG: Index should start from 1, not 0

        ResultSet rs = pstmt.executeQuery();

        rs.next();
        String email = rs.getString(0); // BUG: Index should start from 1, not 0

        return email;
    }

    public static void main(String[] args) throws SQLException {
        InvalidIndexBug bug = new InvalidIndexBug();
        System.out.println(bug.showBug("testUser"));
    }
}