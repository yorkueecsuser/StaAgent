import org.junit.Test;
import static org.junit.Assert.*;

class ATest {
    @Test
    void testPerfCritical() {
        A a = new A();
        a.perfCritical(); // TRIGGER BUG: CHECKERS_CALLS_EXPENSIVE_METHOD
    }
}