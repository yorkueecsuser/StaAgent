import org.junit.Test;
import static org.junit.Assert.*;

public class CompareObjectsWithEqualsTest {

    @Test
    public void compareStringsTest() {
        CompareObjectsWithEquals compareObjects = new CompareObjectsWithEquals();
        String a = "hello";
        String b = new String("hello"); // a and b are not the same object but have the same value

        // TRIGGER BUG: CompareObjectsWithEquals - a == b should be a.equals(b)
        assertFalse(compareObjects.showBug(a, b));
    }
}