import org.junit.Test;
import static org.junit.Assert.*;

public class NullPointerExampleTest {

    @Test
    public void testShowBugWithNullInput() {
        NullPointerExample example = new NullPointerExample();
        example.showBug(null); // TRIGGER BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
    }
}