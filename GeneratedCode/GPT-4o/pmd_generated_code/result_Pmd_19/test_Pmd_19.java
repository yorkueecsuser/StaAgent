import org.junit.Test;
import static org.junit.Assert.*;

public class BrokenNullCheckExampleTest {

    @Test
    public void testShowBugWithNull() {
        BrokenNullCheckExample example = new BrokenNullCheckExample();
        example.showBug(null); // TRIGGER BUG: BrokenNullCheck
    }

    @Test
    public void testShowBugWithEmptyString() {
        BrokenNullCheckExample example = new BrokenNullCheckExample();
        String result = example.showBug("");
        assertEquals("", result);
    }

    @Test
    public void testShowBug2WithNull() {
        BrokenNullCheckExample example = new BrokenNullCheckExample();
        example.showBug2(null); // TRIGGER BUG: BrokenNullCheck
    }

    @Test
    public void testShowBug2WithEmptyString() {
        BrokenNullCheckExample example = new BrokenNullCheckExample();
        String result = example.showBug2("");
        assertEquals("", result);
    }
}