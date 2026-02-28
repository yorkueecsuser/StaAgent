import org.junit.Test;
import static org.junit.Assert.*;

class OverridableMethodCallInConstructorTest {
    @Test
    public void testBug() {
        OverridableMethodCallInConstructor obj = new OverridableMethodCallInConstructor("Alice", 25);
        // TRIGGER BUG: MC: An overridable method is called from a constructor (MC_OVERRIDABLE_METHOD_CALL_IN_CONSTRUCTOR)
        obj.showBug();
    }
}