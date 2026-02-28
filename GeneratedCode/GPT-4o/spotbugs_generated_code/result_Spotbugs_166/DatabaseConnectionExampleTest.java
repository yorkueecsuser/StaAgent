import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.Connection;

public class DatabaseConnectionExampleTest {

    @Test
    public void testShowBugWithEmptyPassword() {
        DatabaseConnectionExample example = new DatabaseConnectionExample();
        Connection conn = example.showBug("jdbc:mysql://localhost:3306/mydatabase", "root"); // TRIGGER BUG: Dm: Empty database password (DMI_EMPTY_DB_PASSWORD)
        assertNull("Connection should be null due to empty password", conn);
    }

    @Test
    public void testShowBugWithEmptyPasswordFailure() {
        DatabaseConnectionExample example = new DatabaseConnectionExample();
        Connection conn = example.showBug("jdbc:mysql://localhost:3306/mydatabase", "root"); // TRIGGER BUG: Dm: Empty database password (DMI_EMPTY_DB_PASSWORD)
        assertNotNull("Expected to trigger bug and return non-null connection", conn);
    }
}