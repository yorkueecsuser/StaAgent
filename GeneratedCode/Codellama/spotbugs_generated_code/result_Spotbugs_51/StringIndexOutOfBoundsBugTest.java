import org.junit.Test;
import static org.junit.Assert.*;

public class StringIndexOutOfBoundsBugTest {

    @Test
    public void testShowBug() {
        StringIndexOutOfBoundsBug buggy = new StringIndexOutOfBoundsBug();
        // TRIGGER BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)���
        String str = "Hello, World!";
        int index = 15; // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)���
        System.out.println(str.substring(index));
    }
}