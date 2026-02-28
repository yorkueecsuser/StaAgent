import org.junit.Test;
import static org.junit.Assert.*;

public class NullPointerExampleTest {

    @Test
    public void testShowBug() {
        NullPointerExample nullPointerExample = new NullPointerExample();
        nullPointerExample.showBug(); // TRIGGER BUG: NULLPTR_DEREFERENCE
    }
}