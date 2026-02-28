import org.junit.Test;
import static org.junit.Assert.*;

public class ThreadUsageExampleTest {

    @Test
    public void testShowBug1() {
        ThreadUsageExample example = new ThreadUsageExample();
        example.showBug1(); // TRIGGER BUG: DoNotUseThreads
        fail("showBug1 should not allow thread creation in J2EE."); // TRIGGER BUG: DoNotUseThreads
    }

    @Test
    public void testShowBug2() {
        ThreadUsageExample example = new ThreadUsageExample();
        example.showBug2(); // TRIGGER BUG: DoNotUseThreads
        fail("showBug2 should not use ExecutorService in J2EE."); // TRIGGER BUG: DoNotUseThreads
    }
}