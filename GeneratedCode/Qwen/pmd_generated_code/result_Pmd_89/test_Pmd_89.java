import org.junit.Test;
import static org.junit.Assert.*;

public class SynchronizationExampleTest {

    @Test
    public void testShowBug() {
        SynchronizationExample example = new SynchronizationExample();
        int initialCounter = example.showBug() - 1; // TRIGGER BUG: AvoidSynchronizedStatement
        example.showBug();
        assertEquals(initialCounter + 1, example.showBug() - 1);
    }
}