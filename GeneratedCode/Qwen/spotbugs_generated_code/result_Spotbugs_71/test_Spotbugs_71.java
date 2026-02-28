import org.junit.Test;
import static org.junit.Assert.*;

public class VarargsBugExampleTest {

    @Test
    public void testShowBugTriggersBug() {
        VarargsBugExample example = new VarargsBugExample();
        int[] myIntArray = {1, 2, 3};
        assertEquals("Passed array as a single object.", example.showBug(myIntArray)); // TRIGGER BUG: VA: Primitive array passed to function expecting a variable number of object arguments (VA_PRIMITIVE_ARRAY_PASSED_TO_OBJECT_VARARG) ⁠
    }
}