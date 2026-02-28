import org.junit.Test;
import static org.junit.Assert.*;

public class ExpressionsInAssertTest {
    @Test
    public void testBug() {
        List<String> myList = new ArrayList<>();
        myList.add("first");
        myList.add("second");
        myList.add("third");

        assert myList.remove(myList.get(0));  // BUG: Expressions used in "assert" should not produce side effects

        // TRIGGER BUG: Expressions used in "assert" should not produce side effects
    }
}