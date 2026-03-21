import org.junit.Test;
import static org.junit.Assert.*;

public class ExceptionBugDemoTest {

    @Test
    public void testShowBugWithNegativeInput() {
        ExceptionBugDemo demo = new ExceptionBugDemo();
        demo.showBug(-1); // TRIGGER BUG: Exceptions should not be created without being thrown
    }
}