import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

class EqualsHashCodeBugTest {

    @Test
    public void testEqualsHashCodeBug() {
        EqualsHashCodeBug.Person p1 = new EqualsHashCodeBug.Person("John", 25);
        EqualsHashCodeBug.Person p2 = new EqualsHashCodeBug.Person("John", 25);
        Set<EqualsHashCodeBug.Person> personSet = new HashSet<>();
        personSet.add(p1);
        personSet.add(p2);

        // This assertion will pass because equals() method is overridden
        assertEquals(p1, p2);

        // This assertion will pass because hashCode() is not overridden
        assertNotEquals(p1.hashCode(), p2.hashCode());
    }
}