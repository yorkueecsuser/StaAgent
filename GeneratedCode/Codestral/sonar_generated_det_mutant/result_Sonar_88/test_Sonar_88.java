import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class BuggyCodeTest {

    @Test
    public void testGetStringArray() {
        BuggyCode buggyCode = new BuggyCode();
        List<String> strings = Arrays.asList("Hello", "World", null); // Adding null to trigger ClassCastException
        buggyCode.showBug(); // TRIGGER BUG: "Collection.toArray()" should be passed an array of the proper type
    }
}