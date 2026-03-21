import org.junit.Test;
import static org.junit.Assert.*;

public class SynchronizedGetterSetterExampleTest {

    @Test
    public void testShowBug() {
        SynchronizedGetterSetterExample example = new SynchronizedGetterSetterExample();
        example.showBug(); // TRIGGER BUG: Getters and setters should be synchronized in pairs

        // Assert that the counter should be 2, which may not be the case due to the bug
        assertEquals(2, example.getCounter()); // TRIGGER BUG: Getters and setters should be synchronized in pairs
    }
}