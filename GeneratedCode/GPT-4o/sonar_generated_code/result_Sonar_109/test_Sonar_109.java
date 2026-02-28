import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyIteratorExampleTest {

    @Test
    public void testShowBugTriggersException() {
        BuggyIteratorExample example = new BuggyIteratorExample();
        String[] data = {"one", "two", "three"};

        // Attempting to trigger the bug by calling showBug method
        // We expect that when the iterator is exhausted, the next() method should throw NoSuchElementException
        // TRIGGER BUG: "Iterator.next()" methods should throw "NoSuchElementException"
        String result = example.showBug(data);

        // Since the bug causes the result to not match the expected output, the test will fail
        assertEquals("one two three No more elements.", result);
    }
}