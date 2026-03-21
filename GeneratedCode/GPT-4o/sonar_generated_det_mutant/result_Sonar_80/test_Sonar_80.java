import org.junit.Test;
import static org.junit.Assert.*;

public class VolatileNonPrimitiveExampleTest {

    @Test
    public void testShowBug() {
        int[] initialArray = {1, 2, 3};
        VolatileNonPrimitiveExample.MyObj initialObj = new VolatileNonPrimitiveExample.MyObj("Initial");
        VolatileNonPrimitiveExample example = new VolatileNonPrimitiveExample(initialArray, initialObj);
        
        example.showBug(1, 10); // TRIGGER BUG: Non-primitive fields should not be "volatile"
        assertEquals(10, initialArray[1]); // TRIGGER BUG: Non-primitive fields should not be "volatile"
    }

    @Test
    public void testShowBug2() {
        int[] initialArray = {1, 2, 3};
        VolatileNonPrimitiveExample.MyObj initialObj = new VolatileNonPrimitiveExample.MyObj("Initial");
        VolatileNonPrimitiveExample example = new VolatileNonPrimitiveExample(initialArray, initialObj);
        
        example.showBug2("Updated"); // TRIGGER BUG: Non-primitive fields should not be "volatile"
        assertEquals("Updated", initialObj.getValue()); // TRIGGER BUG: Non-primitive fields should not be "volatile"
    }
}