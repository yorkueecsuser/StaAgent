import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyAsyncFunctionTest {

    @Test
    public void testShowBug() {
        try {
            BuggyAsyncFunction.showBug("test").get(); // TRIGGER BUG: AsyncFunctionReturnsNull
            fail("Expected NullPointerException to be thrown");
        } catch (Exception e) {
            assertTrue(e instanceof java.util.concurrent.ExecutionException);
            assertTrue(e.getCause() instanceof java.lang.NullPointerException);
        }
    }
}