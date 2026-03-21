import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;
import java.util.Collections;

public class MainTest {
    @Test
    public void showBugTest() {
        List<String> emptyList = Collections.emptyList();
        emptyList.add("This will trigger an UnsupportedOperationException"); // TRIGGER BUG: Unsupported methods should not be called on some collection implementations
    }
}