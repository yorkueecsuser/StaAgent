import org.junit.Test;
import static org.junit.Assert.*;

public class NullPointerExampleTest {

    @Test
    public void testShowBugWithNullInput() {
        NullPointerExample example = new NullPointerExample();
        example.showBug(null); // TRIGGER BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
    }
}