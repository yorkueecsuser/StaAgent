import org.junit.Test;
import static org.junit.Assert.*;

public class CheckReturnValueExampleTest {

    @Test
    public void testShowBug() {
        CheckReturnValueExample example = new CheckReturnValueExample();
        example.showBug(); // TRIGGER BUG: CheckReturnValue
        fail("Expected the showBug method to handle the return value of concat properly.");
    }
}