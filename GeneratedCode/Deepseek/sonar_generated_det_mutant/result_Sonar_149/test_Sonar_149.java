import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;

public class BugExampleTest {
    @Test
    public void testShowBug() throws Exception {
        BugExample be = new BugExample();
        be.showBug(); // TRIGGER BUG: Reflection should not be used to check non-runtime annotations
    }
}