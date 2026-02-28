import org.junit.Test;
import static org.junit.Assert.*;

public class IncompatibleArrayCompareBugTest {
    @Test
    public void testIncompatibleArrayCompareBug() {
        IncompatibleArrayCompareBug buggyClass = new IncompatibleArrayCompareBug();
        String[] array1 = {"Hello", "World"};
        Integer[] array2 = {1, 2};
        // TRIGGER BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)
        assertFalse(buggyClass.showBug(array1, array2));
    }
}