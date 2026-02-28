import org.junit.*;
import static org.junit.Assert.*;

public class IteratorBugTest {

    @Test // TRIGGER BUG: "Iterator.hasNext()" should not call "Iterator.next()"
    public void testShowBug() {
        IteratorBug bug = new IteratorBug();
        assertEquals("Bug not triggered. Expected odd number 1 but got ", 1, bug.showBug());
    }
}