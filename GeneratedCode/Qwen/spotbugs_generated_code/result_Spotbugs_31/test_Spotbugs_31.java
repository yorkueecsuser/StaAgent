import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Set;

public class HashCodeBugExampleTest {

    @Test
    public void testShowBug() {
        HashCodeBugExample example = new HashCodeBugExample();
        Set<HashCodeBugExample.Person> result = example.showBug(); // TRIGGER BUG: HE: Use of class without a hashCode() method in a hashed data structure (HE_USE_OF_UNHASHABLE_CLASS)
        assertEquals(2, result.size()); // This assertion will fail because the third "Alice" is not recognized as a duplicate
    }
}