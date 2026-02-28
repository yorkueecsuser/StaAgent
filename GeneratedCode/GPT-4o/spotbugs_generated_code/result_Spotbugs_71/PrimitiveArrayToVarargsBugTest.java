import org.junit.Test;
import static org.junit.Assert.*;

public class PrimitiveArrayToVarargsBugTest {

    @Test
    public void testShowBugWithPrimitiveArray() {
        int[] primitiveArray = {1, 2, 3};
        String result = PrimitiveArrayToVarargsBug.showBug(primitiveArray); // TRIGGER BUG: VA: Primitive array passed to function expecting a variable number of object arguments (VA_PRIMITIVE_ARRAY_PASSED_TO_OBJECT_VARARG)
        
        assertEquals("1 2 3", result); // This assertion will fail because of the bug
    }
}