import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class UnexpectedWarningTest {

    @Test
    public void testShowBug() {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Hello");
        arr.add("World");
        UnexpectedWarning uw = new UnexpectedWarning();

        // TRIGGER BUG: FB: Unexpected/undesired warning from SpotBugs (FB_UNEXPECTED_WARNING)
        // This line should trigger the bug
        uw.showBug(arr);
    }
}