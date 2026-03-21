import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.SQLException;

public class BuggyCodeTest {
    @Test
    public void testShowBug() {
        BuggyCode buggyCode = new BuggyCode();
        try {
            buggyCode.showBug();
            fail("Expected SQLException to be thrown"); // TRIGGER BUG: Dm: Hardcoded constant database password (DMI_CONSTANT_DB_PASSWORD)
        } catch (SQLException e) {
            // Expected exception, do nothing
        }
    }
}