import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyClassTest {

    @Test
    public void testShowBug() throws Exception {
        BuggyClass bc = new BuggyClass();
        bc.showBug(); // TRIGGER BUG: DoNotThrowExceptionInFinally
    }
}