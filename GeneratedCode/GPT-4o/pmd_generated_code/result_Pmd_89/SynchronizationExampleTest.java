import org.junit.Test;
import static org.junit.Assert.*;

public class SynchronizationExampleTest {

    @Test
    public void testShowBug() {
        SynchronizationExample example = new SynchronizationExample();
        example.showBug(); // TRIGGER BUG: AvoidSynchronizedStatement
    }
}