import org.junit.Test;
import static org.junit.Assert.*;

public class NullCloseExampleTest {

    @Test
    public void testShowBug() {
        NullCloseExample example = new NullCloseExample();
        example.showBug(); // TRIGGER BUG: NP: close() invoked on a value that is always null (NP_CLOSING_NULL)
    }
}