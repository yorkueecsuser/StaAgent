import org.junit.Test;
import static org.junit.Assert.*;
import java.util.NoSuchElementException;

public class FaultyIteratorTest {

    @Test
    public void testShowBug() {
        String[] data = {"One", "Two"};
        FaultyIterator iterator = new FaultyIterator(data);

        // Iterate through all elements
        while (iterator.hasNext()) {
            iterator.next();
        }

        // TRIGGER BUG: "Iterator.next()" methods should throw "NoSuchElementException"
        iterator.showBug(); // This should cause the test to fail as it returns null instead of throwing NoSuchElementException
    }
}