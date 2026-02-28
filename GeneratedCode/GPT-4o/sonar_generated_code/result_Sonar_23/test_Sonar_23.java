import org.junit.Test;
import static org.junit.Assert.*;

public class CastExceptionExampleTest {

    @Test
    public void testShowBugWithNonString() {
        CastExceptionExample example = new CastExceptionExample();
        
        // This will cause a ClassCastException since the input is not a String
        example.showBug(new Integer(10)); // TRIGGER BUG: Cast operations should not trigger a ClassCastException
    }
}