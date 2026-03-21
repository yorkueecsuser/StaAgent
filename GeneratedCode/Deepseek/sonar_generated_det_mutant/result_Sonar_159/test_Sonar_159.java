import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyIteratorTest {
    @Test
    public void testShowBug() {
        BuggyIterator buggyIterator = new BuggyIterator();
        boolean result = buggyIterator.showBug();
        assertFalse(result); // TRIGGER BUG: "Iterator.hasNext()" should not call "Iterator.next()"
    }
}