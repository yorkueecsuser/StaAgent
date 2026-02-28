import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayIndexOutOfBoundsBugTest {

    @Test
    public void testShowBug() {
        ArrayIndexOutOfBoundsBug buggyObject = new ArrayIndexOutOfBoundsBug();
        Object[] array = new Object[3];
        // TRIGGER BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX)
        Object result = buggyObject.showBug(array, 5);
        assertNotNull(result);
    }
}