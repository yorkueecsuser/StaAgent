import org.junit.Test;
import static org.junit.Assert.*;

public class BugDemoTest {
    @Test
    public void testShowBug() {
        BugDemo.showBug(); // TRIGGER BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
    }
}