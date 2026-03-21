import org.junit.Test;
import static org.junit.Assert.*;

public class CTest {
    @Test  
    public void testPerfCritical() {
        C c = new C();
        c.showBug(); // TRIGGER BUG: CHECKERS_CALLS_EXPENSIVE_METHOD
    }
}