import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class MainTest {
    // TRIGGER BUG: AssertJ methods setting the assertion context should come before an assertion
    @Test
    public void testShowBug() {
        Main.showBug();
    }
}