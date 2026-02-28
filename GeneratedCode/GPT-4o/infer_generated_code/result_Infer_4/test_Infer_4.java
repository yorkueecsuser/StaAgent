import org.junit.Test;
import static org.junit.Assert.*;

public class ExpensiveMethodExampleTest {

    @Test
    public void testShowBug() {
        ExpensiveMethodExample example = new ExpensiveMethodExample();
        String result = example.showBug(); // TRIGGER BUG: CHECKERS_CALLS_EXPENSIVE_METHOD
        assertEquals("Bug demonstrated by calling an expensive method from a performance critical one.", result);
    }
}