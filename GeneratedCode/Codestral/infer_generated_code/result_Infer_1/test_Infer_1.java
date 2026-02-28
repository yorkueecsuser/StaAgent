import org.junit.Test;
import static org.junit.Assert.*;

public class ArbitraryCodeExecutionUnderLockTest {

    @Test
    public void testShowBug() {
        ArbitraryCodeExecutionUnderLock obj = new ArbitraryCodeExecutionUnderLock();
        obj.showBug(); // TRIGGER BUG: ARBITRARY_CODE_EXECUTION_UNDER_LOCK
    }
}