import org.junit.Test;
import static org.junit.Assert.*;

public class StringIndexOutOfBoundsExampleTest {

    @Test
    public void testShowBugWithShortString() {
        StringIndexOutOfBoundsExample example = new StringIndexOutOfBoundsExample();
        example.showBug("abcd"); // TRIGGER BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
    }

    @Test
    public void testShowBugWithEmptyString() {
        StringIndexOutOfBoundsExample example = new StringIndexOutOfBoundsExample();
        example.showBug(""); // TRIGGER BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
    }
}