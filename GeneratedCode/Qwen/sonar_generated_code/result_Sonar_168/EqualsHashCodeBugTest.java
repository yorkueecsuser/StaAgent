import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashSet;
import java.util.Set;

public class EqualsHashCodeBugTest {

    @Test
    public void testHashSetWithEqualObjects() {
        EqualsHashCodeBug person1 = new EqualsHashCodeBug("Alice", 30);
        EqualsHashCodeBug person2 = new EqualsHashCodeBug("Alice", 30);

        Set<EqualsHashCodeBug> set = new HashSet<>();
        set.add(person1);
        set.add(person2);

        assertEquals(1, set.size()); // TRIGGER BUG: "equals(Object obj)" and "hashCode()" should be overridden in pairs
    }
}