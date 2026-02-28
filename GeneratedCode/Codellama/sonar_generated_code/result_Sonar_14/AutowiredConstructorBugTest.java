import org.junit.Test;
import static org.junit.Assert.*;

public class AutowiredConstructorBugTest {
    @Test
    public void testBug() {
        AutowiredConstructorBug bug = new AutowiredConstructorBug();
        bug.showBug();
        // TRIGGER BUG: "@Autowired" should only be used on a single constructor
    }
}