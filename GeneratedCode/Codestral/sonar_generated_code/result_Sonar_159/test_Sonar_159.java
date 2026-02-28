import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.Arrays;

public class BuggyIteratorTest {
    @Test
    public void testShowBug() {
        BuggyIterator buggyIterator = new BuggyIterator();
        List<Integer> list = Arrays.asList(1, -1, 3, -3);

        // TRIGGER BUG: "Iterator.hasNext()" should not call "Iterator.next()"
        assertFalse(buggyIterator.showBug(list));
    }
}