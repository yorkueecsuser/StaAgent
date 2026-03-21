import org.junit.Test;
import static org.junit.Assert.*;

public class ArbitraryCodeExecutionUnderLockTest {

    @Test
    public void testExampleOfBadPattern() {
        ArbitraryCodeExecutionUnderLock instance = new ArbitraryCodeExecutionUnderLock();
        SettableFuture future = new SettableFuture();
        instance.setFuture(future);
        instance.showBug(); // TRIGGER BUG: ARBITRARY_CODE_EXECUTION_UNDER_LOCK
        fail("This test is expected to fail due to the bug"); // Ensure the test fails
    }
}