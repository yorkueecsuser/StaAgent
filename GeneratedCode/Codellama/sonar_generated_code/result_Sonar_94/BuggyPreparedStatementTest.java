import java.sql.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyPreparedStatementTest {
    @Test
    public void testPreparedStatement() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE id =?");
            // TRIGGER BUG: "PreparedStatement" and "ResultSet" methods should be called with valid indices
            ps.setInt(1, 1);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }
            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}