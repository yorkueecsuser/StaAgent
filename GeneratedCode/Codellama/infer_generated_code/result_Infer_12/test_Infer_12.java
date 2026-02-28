import org.junit.Test;
import static org.junit.Assert.*;

public class NullPointerExampleTest {
    @Test
    public void testShowBug() {
        NullPointerExample npe = new NullPointerExample();
        npe.showBug(); // TRIGGER BUG: NULLPTR_DEREFERENCE
    }
}