import org.junit.Test;
import static org.junit.Assert.*;

public class NullPointerExampleTest {

    @Test
    public void testShowBugTrigger() {
        NullPointerExample example = new NullPointerExample();
        // The following line should trigger the bug
        example.showBug(null); // TRIGGER BUG: Null pointers should not be dereferenced
    }
}