import org.junit.Test;
import static org.junit.Assert.*;

public class ModifiesImmutableBugTest {
    @Test
    public void testModifiesImmutable() {
        ModifiesImmutableBug bug = new ModifiesImmutableBug();
        int[] array = bug.getTestArray();
        array[2] = 10; // TRIGGER BUG: MODIFIES_IMMUTABLE
        bug.showBug();
        assertNotEquals(10, bug.testArray[2]); // The test will fail here because the value of testArray[2] is not 10 as expected.
    }
}