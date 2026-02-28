import org.junit.Test;
import static org.junit.Assert.*;

public class ThreadUsageExampleTest {

    @Test
    public void testShowBug1() {
        ThreadUsageExample example = new ThreadUsageExample();
        example.showBug1(); // TRIGGER BUG: DoNotUseThreads
    }

    @Test
    public void testShowBug2() {
        ThreadUsageExample example = new ThreadUsageExample();
        example.showBug2(); // TRIGGER BUG: DoNotUseThreads
    }
}