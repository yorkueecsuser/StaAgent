import org.junit.Test;
import static org.junit.Assert.*;

public class ClassCastExceptionExampleTest {

    @Test
    public void testShowBugWithInteger() {
        ClassCastExceptionExample example = new ClassCastExceptionExample();
        example.showBug(new Integer(123)); // TRIGGER BUG: Cast operations should not trigger a ClassCastException
    }
}