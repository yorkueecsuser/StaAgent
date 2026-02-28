import org.junit.Test;
import static org.junit.Assert.*;

public class StringIndexOutOfBoundsBugTest {

    @Test
    public void testShowBug() {
        StringIndexOutOfBoundsBug.showBug("Hello", 5); // TRIGGER BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
    }
}