import org.junit.Test;
import static org.junit.Assert.*;

public class InappropriateCollectionCallsTest {
    @Test
    public void testBugTrigger() {
        List<String> strList = new ArrayList<>();
        strList.add("Hello");
        strList.add("World");

        // TRIGGER BUG: Inappropriate "Collection" calls should not be made
        int index = strList.indexOf(1);
        assertEquals(-1, index);
    }
}