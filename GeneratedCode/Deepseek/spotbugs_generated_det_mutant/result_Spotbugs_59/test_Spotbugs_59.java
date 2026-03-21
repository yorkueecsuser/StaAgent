import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test // TRIGGER BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
    public void testShowBug() {
        Main m = new Main();
        m.showBug(new String[]{"Hello", null, "World"}); // This will trigger the bug
    }
}