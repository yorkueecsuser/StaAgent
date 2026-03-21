import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.Arrays;

public class BuggyMethodParametersTest {
    @Test
    public void testDoTheThing() {
        BuggyMethodParameters bmp = new BuggyMethodParameters();
        String result = bmp.showBug(5);
        // TRIGGER BUG: Method parameters' initial values should not be ignored
        assertNotEquals("5", result);
        assertNotEquals("hello world", result);
    }
}