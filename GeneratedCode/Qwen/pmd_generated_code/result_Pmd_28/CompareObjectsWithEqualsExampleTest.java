import org.junit.Test;
import static org.junit.Assert.*;

public class CompareObjectsWithEqualsExampleTest {

    @Test
    public void testCompareUsingDoubleEquals() {
        CompareObjectsWithEqualsExample example1 = new CompareObjectsWithEqualsExample("example");
        CompareObjectsWithEqualsExample example2 = new CompareObjectsWithEqualsExample("example");

        assertFalse(example1.compareUsingDoubleEquals(example2)); // TRIGGER BUG: CompareObjectsWithEquals
    }

    @Test
    public void testShowBug() {
        CompareObjectsWithEqualsExample example1 = new CompareObjectsWithEqualsExample("example");
        CompareObjectsWithEqualsExample example2 = new CompareObjectsWithEqualsExample("example");

        assertFalse(example1.showBug(example1, example2)); // TRIGGER BUG: CompareObjectsWithEquals
    }
}