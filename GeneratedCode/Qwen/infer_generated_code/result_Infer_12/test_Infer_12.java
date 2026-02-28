import org.junit.Test;
import static org.junit.Assert.*;

public class NullPointerExampleTest {

    @Test
    public void testShowBugTriggersNullPointerException() {
        NullPointerExample example = new NullPointerExample();
        example.showBug(); // TRIGGER BUG: NULLPTR_DEREFERENCE
    }
}