import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class BuggyIteratorTest {
    @Test(expected = NoSuchElementException.class)
    public void testIteratorBug() {
        BuggyIterator buggyIterator = new BuggyIterator(new ArrayList<>());
        buggyIterator.showBug();
        buggyIterator.next(); // TRIGGER BUG: "Iterator.next()" methods should throw "NoSuchElementException"
    }
}