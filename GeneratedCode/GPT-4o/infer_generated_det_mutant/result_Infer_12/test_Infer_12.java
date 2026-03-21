import org.junit.Test;
import static org.junit.Assert.*;

public class NullPointerExampleTest {

    @Test
    public void testShowBug() {
        NullPointerExample example = new NullPointerExample();
        example.showBug(); // TRIGGER BUG: NULLPTR_DEREFERENCE
    }
}