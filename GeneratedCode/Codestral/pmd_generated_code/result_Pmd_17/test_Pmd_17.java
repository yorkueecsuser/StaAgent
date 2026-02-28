import org.junit.Test;
import static org.junit.Assert.*;

public class MultipleUnaryOperatorsBugTest {

    @Test
    public void testShowBug() {
        MultipleUnaryOperatorsBug bug = new MultipleUnaryOperatorsBug();
        assertEquals(-1, bug.showBug()); // TRIGGER BUG: AvoidMultipleUnaryOperators
    }
}