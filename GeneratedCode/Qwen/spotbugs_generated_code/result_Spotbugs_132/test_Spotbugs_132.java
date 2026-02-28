import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayToStringBugTest {

    @Test
    public void testShowBug() {
        ArrayToStringBug bugDemo = new ArrayToStringBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        String result = bugDemo.showBug(sampleArray); // TRIGGER BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY) 
        assertEquals("[1, 2, 3, 4, 5]", result);
    }
}