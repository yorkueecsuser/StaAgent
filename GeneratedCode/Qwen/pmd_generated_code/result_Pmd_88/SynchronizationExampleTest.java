import org.junit.Test;
import static org.junit.Assert.*;

public class SynchronizationExampleTest {

    @Test
    public void testIncrementSharedData() {
        SynchronizationExample example = new SynchronizationExample();
        assertEquals(0, example.showBug()); // TRIGGER BUG: AvoidSynchronizedAtMethodLevel
    }

    @Test
    public void testStaticIncrementSharedData() {
        SynchronizationExample example = new SynchronizationExample();
        assertEquals(0, example.showBugStatic()); // TRIGGER BUG: AvoidSynchronizedAtMethodLevel
    }
}