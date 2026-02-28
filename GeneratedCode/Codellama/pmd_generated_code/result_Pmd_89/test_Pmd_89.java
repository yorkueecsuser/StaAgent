import org.junit.Test;
import static org.junit.Assert.*;

public class SynchronizedBugExampleTest {
    @Test
    public void testShowBug() {
        // TRIGGER BUG: AvoidSynchronizedStatement
        SynchronizedBugExample example = new SynchronizedBugExample();
        example.showBug();
    }
}