import org.junit.Test;
import static org.junit.Assert.*;

public class OverridesJavaxInjectableMethodExampleTest {

    @Test
    public void testInitializeInSubClass() {
        SubClass subClass = new SubClass();
        assertEquals("Initialized in SuperClass", subClass.showBug()); // TRIGGER BUG: OverridesJavaxInjectableMethod
    }
}