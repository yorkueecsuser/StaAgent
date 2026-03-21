import org.junit.Test;
import static org.junit.Assert.*;

public class UnaryOperatorBugTest {

    private UnaryOperatorBug bugInstance = new UnaryOperatorBug();

    @Test
    public void testShowBug() {
        bugInstance.showBug(); // TRIGGER BUG: Unary prefix operators should not be repeated
    }
}