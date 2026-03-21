import org.junit.Test;
import static org.junit.Assert.*;

public class ClassCastExceptionDemoTest {

    @Test
    public void testShowBugWithNonStringInput() {
        ClassCastExceptionDemo demo = new ClassCastExceptionDemo();
        Object nonStringInput = new Integer(123);
        demo.showBug(nonStringInput); // TRIGGER BUG: Cast operations should not trigger a ClassCastException
    }
}