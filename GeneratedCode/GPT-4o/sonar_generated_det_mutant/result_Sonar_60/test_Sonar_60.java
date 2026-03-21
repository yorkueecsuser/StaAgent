import org.junit.Test;
import static org.junit.Assert.*;

public class IterableIteratorBugTest {

    @Test
    public void testShowBug() {
        IterableIteratorBug buggyIterator = new IterableIteratorBug(new int[]{1, 2, 3});
        buggyIterator.showBug(); // TRIGGER BUG: "iterator" should not return "this"
    }
}