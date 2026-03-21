import org.junit.Test;
import static org.junit.Assert.*;

public class ValueBasedBugTest {

    @Test
    public void testShowBug() {
        ValueBasedBug bug = new ValueBasedBug();
        bug.showBug(); // TRIGGER BUG: Synchronization should not be done on instances of value-based classes
    }
}