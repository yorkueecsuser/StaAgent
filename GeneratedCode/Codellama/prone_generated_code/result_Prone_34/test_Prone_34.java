import org.junit.Test;
import static org.junit.Assert.*;

import java.util.function.Consumer;

class DiscardedPostfixExpressionTest {
    @Test
    public void testShowBug() {
        Consumer<Integer> consumer = (x) -> x++;
        DiscardedPostfixExpression.showBug(consumer);
    }
}