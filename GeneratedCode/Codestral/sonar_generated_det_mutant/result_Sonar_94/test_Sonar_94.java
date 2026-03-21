import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.SQLException;

public class BuggyDatabaseAccessTest {

    @Test
    public void testShowBug() throws SQLException {
        BuggyDatabaseAccess buggyDatabaseAccess = new BuggyDatabaseAccess();
        // TRIGGER BUG: "PreparedStatement" and "ResultSet" methods should be called with valid indices
        buggyDatabaseAccess.showBug("SELECT * FROM TEST_TABLE", 10);
    }
}