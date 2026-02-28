import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class DiscardedPostfixExpressionExampleTest {

    @Test
    public void testShowBug() {
        DiscardedPostfixExpressionExample example = new DiscardedPostfixExpressionExample();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        example.showBug(numbers); // TRIGGER BUG: DiscardedPostfixExpression
        assertEquals(Arrays.asList(2, 3, 4, 5, 6), numbers); // This assertion will fail, demonstrating the bug
    }
}