import org.junit.Test;
import static org.junit.Assert.*;

public class PrimitiveArrayToObjectVarargBugTest {
    @Test
    public void testShowBug() {
        PrimitiveArrayToObjectVarargBug bugInstance = new PrimitiveArrayToObjectVarargBug();
        bugInstance.showBug(); // TRIGGER BUG: VA: Primitive array passed to function expecting a variable number of object arguments (VA_PRIMITIVE_ARRAY_PASSED_TO_OBJECT_VARARG)
    }
}