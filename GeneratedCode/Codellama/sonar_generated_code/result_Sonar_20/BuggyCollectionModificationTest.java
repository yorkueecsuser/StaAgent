import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCollectionModificationTest {
    @Test
    public void testBug() {
        List<String> lst = new ArrayList<>();
        lst.add("apple");
        lst.add("banana");
        lst.add("cherry");
        lst.add("date");
        
        BuggyCollectionModification.showBug(lst);
        
        // TRIGGER BUG: Collections should not be modified while they are iterated
        assertEquals("apple", lst.get(0));
        assertEquals("banana", lst.get(1));
        assertEquals("cherry", lst.get(2));
        assertEquals("date", lst.get(3));
    }
}