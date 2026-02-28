import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayToStringBugTest {

    @Test
    public void testShowBug() {
        ArrayToStringBug bugDemo = new ArrayToStringBug();
        String result = bugDemo.showBug(); // TRIGGER BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)
        assertEquals("[1, 2, 3, 4, 5]", result); // This assertion will fail because the actual result is something like [I@16f0472
    }
}