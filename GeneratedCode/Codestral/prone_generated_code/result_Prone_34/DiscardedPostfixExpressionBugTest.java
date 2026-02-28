import org.junit.Test;
import static org.junit.Assert.*;

public class DiscardedPostfixExpressionBugTest {
    @Test
    public void testDiscardedPostfixExpression() {
        DiscardedPostfixExpressionBug buggyClass = new DiscardedPostfixExpressionBug();
        String input = "test";
        try {
            buggyClass.showBug(input); // TRIGGER BUG: DiscardedPostfixExpression
            fail("Expected an UnsupportedOperationException to be thrown");
        } catch (UnsupportedOperationException e) {
            // Expected exception
        }
    }
}