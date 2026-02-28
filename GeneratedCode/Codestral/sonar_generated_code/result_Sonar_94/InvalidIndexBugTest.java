import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.SQLException;

public class InvalidIndexBugTest {

    @Test
    public void testShowBug() throws SQLException {
        InvalidIndexBug bug = new InvalidIndexBug();
        // TRIGGER BUG: "PreparedStatement" and "ResultSet" methods should be called with valid indices
        bug.showBug("testUser");
    }
}