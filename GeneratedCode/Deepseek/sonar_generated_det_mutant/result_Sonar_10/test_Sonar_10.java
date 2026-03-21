import org.junit.*;
import static org.junit.Assert.*;

public class SpelBugTest {
    private SpelBug spelBug;

    @Before
    public void setUp() {
        spelBug = new SpelBug();
    }

    @Test
    public void testShowBug() {
        // This test case is designed to fail intentionally
        spelBug.showBug(); // TRIGGER BUG: SpEL expression should have a valid syntax
    }
}