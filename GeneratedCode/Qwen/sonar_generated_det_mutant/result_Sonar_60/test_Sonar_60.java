import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyIterableTest {

    @Test
    public void testShowBug() {
        BuggyIterable buggyIterable = new BuggyIterable(new int[]{1, 2, 3, 4, 5});
        String result = buggyIterable.showBug(); // TRIGGER BUG: "iterator" should not return "this"
        assertEquals("1 2 3 4 5 \n", result); // This assertion will fail due to the bug
    }
}