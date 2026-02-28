import org.junit.Test;
import static org.junit.Assert.*;

public class NonFinalStaticFieldBugTest {

    @Test
    public void testNonFinalStaticFieldBug() {
        NonFinalStaticFieldBug.showBug();
        String initialValue = NonFinalStaticFieldBug.nonFinalStaticField;
        NonFinalStaticFieldBug.changeStaticField("Changed Value");
        NonFinalStaticFieldBug.showBug();
        assertEquals("The non-final static field should not have changed.", initialValue, NonFinalStaticFieldBug.nonFinalStaticField); // TRIGGER BUG: MS: Field isn’t final but should be (MS_SHOULD_BE_FINAL)
    }
}