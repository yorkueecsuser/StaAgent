import org.junit.Test;
import static org.junit.Assert.*;

public class ATest {

    @Test
    public void testShowBug() {
        A a = new A();
        a.showBug(); // TRIGGER BUG: CHECKERS_EXPENSIVE_OVERRIDES_UNANNOTATED
        fail("This test case should trigger the expensive overrides unannotated bug."); // TRIGGER BUG: CHECKERS_EXPENSIVE_OVERRIDES_UNANNOTATED
    }
}