import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyClassTest {

    @Test
    public void testDirectlyAllocatingMethod() {
        BuggyClass buggyClass = new BuggyClass();
        buggyClass.showBug();  // TRIGGER BUG: CHECKERS_ALLOCATES_MEMORY
    }
}