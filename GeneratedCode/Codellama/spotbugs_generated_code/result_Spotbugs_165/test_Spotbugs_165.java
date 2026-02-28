import org.junit.Test;
import static org.junit.Assert.*;

public class HardcodedPasswordTest {
    @Test
    public void testShowBug() {
        // TRIGGER BUG: Dm: Hardcoded constant database password (DMI_CONSTANT_DB_PASSWORD)
        String password = "password";
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", password);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM users");
        assertEquals("Should have a hardcoded database password", "password", password);
    }
}