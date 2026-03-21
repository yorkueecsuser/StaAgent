import org.junit.Test;
import static org.junit.Assert.*;

public class NullPointerOnExceptionPathTest {
    NullPointerOnExceptionPath test = new NullPointerOnExceptionPath();

    @Test
    public void testShowBug() {
        // TRIGGER BUG: NP: Possible null pointer dereference in method on exception path (NP_NULL_ON_SOME_PATH_EXCEPTION)
        test.showBug();
    }
}