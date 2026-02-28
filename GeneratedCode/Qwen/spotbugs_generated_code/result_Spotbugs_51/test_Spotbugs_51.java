import org.junit.Test;
import static org.junit.Assert.*;

public class StringIndexOutOfBoundsExampleTest {

    @Test
    public void testShowBugWithInvalidIndex() {
        StringIndexOutOfBoundsExample example = new StringIndexOutOfBoundsExample();
        // TRIGGER BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX) 
        example.showBug("Hello", 5); // This will throw StringIndexOutOfBoundsException
    }
}