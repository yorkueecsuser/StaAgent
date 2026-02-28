import org.junit.Test;
import static org.junit.Assert.*;

public class DiscardedPostfixExampleTest {

    @Test
    public void testShowBug() {
        DiscardedPostfixExample example = new DiscardedPostfixExample();
        int initialValue = 5;
        example.showBug(initialValue); // TRIGGER BUG: DiscardedPostfixExpression
        assertEquals(5, initialValue); // This assertion will fail, expecting the value to have changed which it doesn't
    }
}