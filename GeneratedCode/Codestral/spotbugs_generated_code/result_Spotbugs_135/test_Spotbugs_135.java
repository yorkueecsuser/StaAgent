import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyIteratorTest {

    @Test
    public void testHasNext() {
        BuggyIterator buggyIterator = new BuggyIterator(java.util.Arrays.asList(1, 2, 3));
        assertTrue(buggyIterator.hasNext()); // TRIGGER BUG: DMI: hasNext method invokes next (DMI_CALLING_NEXT_FROM_HASNEXT)
        assertEquals(Integer.valueOf(1), buggyIterator.next());
        assertTrue(buggyIterator.hasNext()); // TRIGGER BUG: DMI: hasNext method invokes next (DMI_CALLING_NEXT_FROM_HASNEXT)
        assertEquals(Integer.valueOf(2), buggyIterator.next());
        assertTrue(buggyIterator.hasNext()); // TRIGGER BUG: DMI: hasNext method invokes next (DMI_CALLING_NEXT_FROM_HASNEXT)
        assertEquals(Integer.valueOf(3), buggyIterator.next());
        assertFalse(buggyIterator.hasNext()); // TRIGGER BUG: DMI: hasNext method invokes next (DMI_CALLING_NEXT_FROM_HASNEXT)
    }

    @Test(expected = java.util.NoSuchElementException.class)
    public void testNextNoMoreElements() {
        BuggyIterator buggyIterator = new BuggyIterator(java.util.Arrays.asList(1));
        assertEquals(Integer.valueOf(1), buggyIterator.next());
        buggyIterator.next(); // Should throw NoSuchElementException
    }
}