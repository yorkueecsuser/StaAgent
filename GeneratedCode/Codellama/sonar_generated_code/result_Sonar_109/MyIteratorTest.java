import org.junit.Test;
import static org.junit.Assert.*;

public class MyIteratorTest {
    @Test
    public void testBuggyCode() {
        MyIterator iterator = new MyIterator();

        // TRIGGER BUG: "Iterator.next()" methods should throw "NoSuchElementException"
        iterator.showBug();

        // assert that the bug was triggered
        assertTrue(iterator.hasNext());
        assertEquals("Apple", iterator.next());
        assertEquals("Banana", iterator.next());
        assertEquals("Cherry", iterator.next());
        assertFalse(iterator.hasNext());
    }
}