import org.junit.Test;
import static org.junit.Assert.*;

public class BugDemoTest {

    @Test
    public void testSayHelloTriggersBug() {
        BugDemo.Child child = new BugDemo.Child(); // TRIGGER BUG: MC: An overridable method is called from a constructor (MC_OVERRIDABLE_METHOD_CALL_IN_CONSTRUCTOR)
        String result = child.showBug();
        assertEquals("Hello from Child", result);
    }
}