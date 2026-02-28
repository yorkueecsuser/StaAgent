import org.junit.Test;
import static org.junit.Assert.*;

public class NonsensicalMethodInvocationTest {

    @Test
    public void testShowBug() {
        NonsensicalMethodInvocation obj = new NonsensicalMethodInvocation();
        String actual = obj.showBug("Hello World");
        String expected = "Hello World".toString();
        assertNotEquals(expected, actual); // TRIGGER BUG: DMI: D’oh! A nonsensical method invocation (DMI_DOH)
    }
}