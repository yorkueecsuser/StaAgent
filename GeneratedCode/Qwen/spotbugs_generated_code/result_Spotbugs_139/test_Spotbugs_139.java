import org.junit.Test;
import static org.junit.Assert.*;

public class NonsensicalMethodInvocationTest {

    @Test
    public void testNonsensicalMethodInvocation() {
        NonsensicalMethodInvocation instance = new NonsensicalMethodInvocation();
        String result = instance.showBug("Hello World"); // TRIGGER BUG: DMI: D’oh! A nonsensical method invocation (DMI_DOH)
        assertEquals("HELLO WORLD", result); // This assertion will fail, triggering the bug
    }
}