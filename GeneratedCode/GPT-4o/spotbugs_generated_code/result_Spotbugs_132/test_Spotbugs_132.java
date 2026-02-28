import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayToStringExampleTest {

    @Test
    public void testShowBug() {
        ArrayToStringExample example = new ArrayToStringExample();
        int[] sampleArray = {1, 2, 3, 4, 5};
        String result = example.showBug(sampleArray); // TRIGGER BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
        assertEquals("[1, 2, 3, 4, 5]", result); // This assertion will fail because of the bug
    }
}