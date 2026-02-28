import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayToStringBugDemoTest {

    @Test
    public void testShowBug() {
        ArrayToStringBugDemo demo = new ArrayToStringBugDemo();
        String result = demo.showBug(new int[]{1, 2, 3}); // TRIGGER BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)
        assertEquals("[1, 2, 3]", result); // This will fail, triggering the bug
    }
}