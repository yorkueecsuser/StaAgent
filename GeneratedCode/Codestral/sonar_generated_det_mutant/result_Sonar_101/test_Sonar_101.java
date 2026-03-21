import org.junit.Test;
import static org.junit.Assert.*;

public class ConditionallyExecutedCodeTest {
    @Test
    public void testShowBug() {
        ConditionallyExecutedCode code = new ConditionallyExecutedCode();
        code.showBug();  // TRIGGER BUG: Conditionally executed code should be reachable
        // The test will fail here because the statement inside the if block in the showBug method is never executed
    }
}