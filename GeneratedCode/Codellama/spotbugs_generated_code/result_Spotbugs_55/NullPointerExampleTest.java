import org.junit.Test;
import static org.junit.Assert.*;

public class NullPointerExampleTest {
    @Test
    public void testBugTrigger() {
        NullPointerExample npe = new NullPointerExample();
        npe.showBug();
        // TRIGGER BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
    }
}