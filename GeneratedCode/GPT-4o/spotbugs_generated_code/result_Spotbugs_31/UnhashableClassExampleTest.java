import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashSet;

public class UnhashableClassExampleTest {

    @Test
    public void testShowBugWithDuplicateNames() {
        String[] names = {"Alice", "Bob", "Alice"};
        HashSet<UnhashableClassExample.UnhashableClass> result = UnhashableClassExample.showBug(names);
        assertEquals("HashSet should have size 2 due to duplicate 'Alice'", 2, result.size()); // TRIGGER BUG: HE: Use of class without a hashCode() method in a hashed data structure (HE_USE_OF_UNHASHABLE_CLASS)
    }

    @Test
    public void testShowBugWithUniqueNames() {
        String[] names = {"Alice", "Bob", "Charlie"};
        HashSet<UnhashableClassExample.UnhashableClass> result = UnhashableClassExample.showBug(names);
        assertEquals("HashSet should have size 3 with unique names", 3, result.size());
    }
}