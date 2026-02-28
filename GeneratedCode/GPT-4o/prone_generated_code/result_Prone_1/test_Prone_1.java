import org.junit.Test;
import static org.junit.Assert.*;

public class AlwaysThrowsExampleTest {

    @Test
    public void testShowBugWithNonNumericString() {
        AlwaysThrowsExample example = new AlwaysThrowsExample();
        example.showBug("123abc"); // TRIGGER BUG: AlwaysThrows
    }
}