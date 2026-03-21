import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {

    @Test
    public void triggerBug() {
        BuggyCode bc = new BuggyCode();
        bc.showBug();
        // TRIGGER BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
    }
}