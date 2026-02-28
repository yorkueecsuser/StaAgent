import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class CloseResourceBug {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM users");

            while (rs.next()) {
                System.out.println(rs.getString(1));
            }
        } finally {
            if (rs!= null) {
                rs.close();
            }
            if (stmt!= null) {
                stmt.close();
            }
            if (conn!= null) {
                conn.close();
            }
        }
    }
}

class CloseResourceBugTest {
    @Test
    public void testCloseResourceBug() throws SQLException {
        CloseResourceBug bug = new CloseResourceBug();
        bug.showBug(); // TRIGGER BUG: CloseResource
    }
}