import org.junit.Test;
import static org.junit.Assert.*;

public class OverridableMethodInConstructorTest {

    @Test
    public void testOverridableMethodCallInConstructor() {
        OverridableMethodInConstructor.SubClass sub = new OverridableMethodInConstructor.SubClass(); // TRIGGER BUG: MC: An overridable method is called from a constructor (MC_OVERRIDABLE_METHOD_CALL_IN_CONSTRUCTOR) 
        assertEquals("Base value: 10, Sub value: 20", sub.showBug());
    }
}