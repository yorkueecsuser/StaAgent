import java.util.Arrays;
import java.util.NoSuchElementException;
import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyIteratorTest {
    @Test(expected = NoSuchElementException.class)
    public void testShowBug() {
        BuggyIterator iterator = new BuggyIterator(Arrays.asList("one"));
        iterator.showBug(); // TRIGGER BUG: "Iterator.next()" methods should throw "NoSuchElementException"
    }
}