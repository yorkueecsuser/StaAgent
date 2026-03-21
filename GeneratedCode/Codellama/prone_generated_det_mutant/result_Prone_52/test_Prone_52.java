import org.junit.Test;
import static org.junit.Assert.*;

class FloggerSplitLogStatementTest {
    @Test
    public void testShowBug() {
        // TRIGGER BUG: FloggerSplitLogStatement
        FloggerSplitLogStatement.showBug();
    }
}