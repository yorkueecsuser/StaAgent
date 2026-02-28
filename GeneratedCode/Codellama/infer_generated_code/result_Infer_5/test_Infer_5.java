import org.junit.Test;
import static org.junit.Assert.*;

public class ATest {

    @Test
    public void testExpensiveOverride() {
        A a = new A();
        a.foo(); // TRIGGER BUG: CHECKERS_EXPENSIVE_OVERRIDES_UNANNOTATED
    }
}