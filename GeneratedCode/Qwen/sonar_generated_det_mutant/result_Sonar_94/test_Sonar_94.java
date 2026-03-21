import org.junit.Test;
import static org.junit.Assert.*;

public class PreparedStatementBugExampleTest {

    @Test
    public void testShowBug() {
        PreparedStatementBugExample example = new PreparedStatementBugExample();
        example.showBug(); // TRIGGER BUG: "PreparedStatement" and "ResultSet" methods should be called with valid indices
    }
}