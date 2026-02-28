import org.junit.Test;
import static org.junit.Assert.*;

public class StringConcatenationBugTest {

    @Test
    public void testShowBug() {
        StringConcatenationBug bug = new StringConcatenationBug();
        String result = bug.showBug();

        // TRIGGER BUG: UseStringBufferForStringAppends
        // The bug is triggered by the use of the '+=' operator for appending strings within a loop.
        // This causes the JVM to create and use an internal StringBuffer for each concatenation, inefficiently creating multiple StringBuilder objects.
        assertEquals("String0String1String2String3String4String5String6String7String8String9", result);
    }
}