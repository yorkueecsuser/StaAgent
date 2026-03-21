import org.junit.Test;
import static org.junit.Assert.*;

public class DatabaseBugExampleTest {

    @Test
    public void testShowBug_InvalidPreparedStatementIndex() {
        DatabaseBugExample example = new DatabaseBugExample();
        // This will trigger an IndexOutOfBoundsException due to invalid index 0 for PreparedStatement
        String result = example.showBug(1); // TRIGGER BUG: "PreparedStatement" and "ResultSet" methods should be called with valid indices
        assertNull(result);
    }

    @Test
    public void testShowBug_InvalidResultSetIndex() {
        DatabaseBugExample example = new DatabaseBugExample();
        // This will trigger an IndexOutOfBoundsException due to invalid result set index 0
        String result = example.showBug(0); // TRIGGER BUG: "PreparedStatement" and "ResultSet" methods should be called with valid indices
        assertNull(result);
    }
}