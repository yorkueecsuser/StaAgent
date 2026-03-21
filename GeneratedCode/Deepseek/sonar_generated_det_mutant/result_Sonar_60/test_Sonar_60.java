import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyIterableTest {
    @Test
    public void testBug() {
        BuggyIterable buggyIterable = new BuggyIterable();
        buggyIterable.showBug(); // TRIGGER BUG: "iterator" should not return "this"
    }
}