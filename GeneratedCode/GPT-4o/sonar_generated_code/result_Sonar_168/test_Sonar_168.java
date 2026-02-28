import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Set;
import java.util.HashSet;

public class UnpairedEqualsHashCodeTest {

    @Test
    public void testShowBug() {
        UnpairedEqualsHashCode example = new UnpairedEqualsHashCode("Test", 0);
        Set<UnpairedEqualsHashCode> result = example.showBug();
        assertEquals(1, result.size()); // TRIGGER BUG: "equals(Object obj)" and "hashCode()" should be overridden in pairs
    }
}