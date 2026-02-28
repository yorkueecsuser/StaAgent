import org.junit.Test;
import static org.junit.Assert.*;

public class ValueBasedClassSynchronizationTest {

    @Test
    public void testShowBug() {
        ValueBasedClassSynchronization demo = new ValueBasedClassSynchronization();
        demo.showBug(); // TRIGGER BUG: Synchronization should not be done on instances of value-based classes
    }
}